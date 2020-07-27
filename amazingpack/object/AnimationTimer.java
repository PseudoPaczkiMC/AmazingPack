package amazingpack.object;

import java.lang.management.ManagementFactory;

public class AnimationTimer
{
    private final int delay;
    private int bottom;
    private int top;
    private int timer;
    private boolean wasRising;
    
    public AnimationTimer(final int delay) {
        this.delay = delay;
        this.top = delay;
        this.bottom = 0;
    }
    
    public void update(final boolean increment) {
        if (increment) {
            if (this.timer < this.delay) {
                if (!this.wasRising) {
                    this.bottom = this.timer;
                }
                ++this.timer;
            }
            this.wasRising = true;
        }
        else {
            if (this.timer > 0) {
                if (this.wasRising) {
                    this.top = this.timer;
                }
                --this.timer;
            }
            this.wasRising = false;
        }
    }
    
    public double getValue() {
        return this.wasRising ? Math.sin((this.timer - this.bottom) / (double)(this.delay - this.bottom) * 3.141592653589793 / 2.0) : (1.0 - Math.cos(this.timer / (double)this.top * 3.141592653589793 / 2.0));
    }
}

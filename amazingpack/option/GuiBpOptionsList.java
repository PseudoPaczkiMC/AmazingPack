package amazingpack.option;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Iterator;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.world.WorldProviderHell$BlockRedstoneComparator;
import java.lang.management.ManagementFactory;
import net.minecraft.client.gui.GuiListExtended;

public class GuiBpOptionsList extends GuiListExtended
{
    public GuiBpOptions options;
    public IGuiListEntry[] entries;
    public static String[] g;
    public static String[] h;
    
    static {
        GuiBpOptionsList.g = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\ud8b2\uc51e\ud881\uee2a\ud88f\uc509\ud88a\uef10\ud9e2", 1630190140), WorldProviderHell$BlockRedstoneComparator.G("\u150b\u08b7\u1526\u2387\u153d\u08b2\u1532\u2397", 178419589), WorldProviderHell$BlockRedstoneComparator.G("\u4c20\u5185\u4c1d\u7aa2\u4c0f\u518e\u4c03\u7ab4", -2079183184), WorldProviderHell$BlockRedstoneComparator.G("\u79b1\u641d\u7983\u4f27\u798e\u640a\u7995\u4f3f\u799f\u640b", -1572463837), WorldProviderHell$BlockRedstoneComparator.G("\ufd29\ue08f\ufd0f\ucbbc\ufd03\ue093", 398827451), WorldProviderHell$BlockRedstoneComparator.G("\u7073\u6dca\u7053\u46e9\u7048\u6dc8\u7053\u46e2\u7047\u6dc2\u704c\u46a7\u704b\u6dc7\u7046\u46ec\u705c", -1317334288), WorldProviderHell$BlockRedstoneComparator.G("\u75b2\u6818\u7598\u432d\u759c\u681c", -502917330) };
        GuiBpOptionsList.h = new String[] { WorldProviderHell$BlockRedstoneComparator.G("\u2763\u3ac2\u2740\u11e1\u2745\u3acd\u2743\u11e6\u2745\u3add", -1189853697), WorldProviderHell$BlockRedstoneComparator.G("\u6ed6\u736b\u6ef3\u585b\u6ee1\u736e", 1661340761), WorldProviderHell$BlockRedstoneComparator.G("\u5624\u4b80\u5614\u60ad\u5651\u4bba\u561f\u60ab\u5614\u4b81\u5617\u60be\u5612\u4b96", 1570976936), WorldProviderHell$BlockRedstoneComparator.G("\u6d75\u70d9\u6d47\u5be3\u6d4a\u70ce\u6d51\u5bfb\u6d5b\u70cf", -1633939481), WorldProviderHell$BlockRedstoneComparator.G("\ud56b\uc8c5\ud545\ue3f6\ud549\uc8d9\ud55b", 1252702193), WorldProviderHell$BlockRedstoneComparator.G("\uc71b\udaaf\uc724\uf183\uc72b\udabe\uc721\uf189\uc726\udaea\uc72a\uf189\uc730", -730290799), WorldProviderHell$BlockRedstoneComparator.G("\u7b4a\u66e0\u7b60\u4dd5\u7b64\u66e4", -1985078826) };
    }
    
    public GuiBpOptionsList(final GuiBpOptions options, final Minecraft mcIn) {
        super(mcIn, options.width, options.height, 32, options.height - 32, 24);
        this.options = options;
        final int buttonsPerRow = 2;
        final ArrayList<IGuiListEntry> entriesList = new ArrayList<IGuiListEntry>();
        a[] values;
        for (int length = (values = a.values()).length, j = 0; j < length; ++j) {
            final a category = values[j];
            entriesList.add(new CategoryEntry(category));
            final Iterator<BpOptionValue<?>> it = Minecraft.getMinecraft().gameSettings.bpOptions.options.iterator();
            while (it.hasNext()) {
                final ArrayList<BpOptionValue<?>> arr = new ArrayList<BpOptionValue<?>>();
                for (int i = 0; i < buttonsPerRow && it.hasNext(); ++i) {
                    final BpOptionValue<?> obj = it.next();
                    if (obj.getCategory() == category) {
                        arr.add(obj);
                    }
                    else {
                        --i;
                    }
                }
                final RowBpOption opt = new RowBpOption(options, arr.toArray(new BpOptionValue[0]));
                entriesList.add(opt);
            }
        }
        this.entries = entriesList.toArray(new IGuiListEntry[0]);
    }
    
    @Override
    public IGuiListEntry getListEntry(final int index) {
        return this.entries[index];
    }
    
    @Override
    protected int getSize() {
        return this.entries.length;
    }
    
    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + 15 + 34;
    }
    
    @Override
    public int getListWidth() {
        return super.getListWidth() + 32 + 68;
    }
    
    @Override
    public void drawScreen(final int mouseXIn, final int mouseYIn, final float p_148128_3_) {
        if (this.field_178041_q) {
            this.mouseX = mouseXIn;
            this.mouseY = mouseYIn;
            this.drawBackground();
            final int i = this.getScrollBarX();
            final int j = i + 6;
            this.bindAmountScrolled();
            GlStateManager.disableLighting();
            GlStateManager.disableFog();
            final Tessellator tessellator = Tessellator.getInstance();
            final WorldRenderer worldrenderer = tessellator.getWorldRenderer();
            final int k = this.left + this.width / 2 - this.getListWidth() / 2 + 2;
            final int l = this.top + 4 - (int)this.amountScrolled;
            if (this.hasListHeader) {
                this.drawListHeader(k, l, tessellator);
            }
            this.drawSelectionBox(k, l, mouseXIn, mouseYIn);
            GlStateManager.disableDepth();
            final int borderSize = 4;
            this.overlayBackground(0, this.top, 255, 255);
            this.overlayBackground(this.bottom, this.height, 255, 255);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
            GlStateManager.disableAlpha();
            GlStateManager.shadeModel(7425);
            GlStateManager.disableTexture2D();
            worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
            worldrenderer.pos(this.left, this.top + borderSize, 0.0).tex(0.0, 1.0).color(0, 0, 0, 0).endVertex();
            worldrenderer.pos(this.right, this.top + borderSize, 0.0).tex(1.0, 1.0).color(0, 0, 0, 0).endVertex();
            worldrenderer.pos(this.right, this.top, 0.0).tex(1.0, 0.0).color(0, 0, 0, 255).endVertex();
            worldrenderer.pos(this.left, this.top, 0.0).tex(0.0, 0.0).color(0, 0, 0, 255).endVertex();
            tessellator.draw();
            worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
            worldrenderer.pos(this.left, this.bottom, 0.0).tex(0.0, 1.0).color(0, 0, 0, 255).endVertex();
            worldrenderer.pos(this.right, this.bottom, 0.0).tex(1.0, 1.0).color(0, 0, 0, 255).endVertex();
            worldrenderer.pos(this.right, this.bottom - borderSize, 0.0).tex(1.0, 0.0).color(0, 0, 0, 0).endVertex();
            worldrenderer.pos(this.left, this.bottom - borderSize, 0.0).tex(0.0, 0.0).color(0, 0, 0, 0).endVertex();
            tessellator.draw();
            final int j2 = this.func_148135_f();
            if (j2 > 0) {
                int k2 = (this.bottom - this.top) * (this.bottom - this.top) / this.getContentHeight();
                k2 = MathHelper.clamp_int(k2, 32, this.bottom - this.top - 8);
                int l2 = (int)this.amountScrolled * (this.bottom - this.top - k2) / j2 + this.top;
                if (l2 < this.top) {
                    l2 = this.top;
                }
                worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
                worldrenderer.pos(i, this.bottom, 0.0).tex(0.0, 1.0).color(0, 0, 0, 255).endVertex();
                worldrenderer.pos(j, this.bottom, 0.0).tex(1.0, 1.0).color(0, 0, 0, 255).endVertex();
                worldrenderer.pos(j, this.top, 0.0).tex(1.0, 0.0).color(0, 0, 0, 255).endVertex();
                worldrenderer.pos(i, this.top, 0.0).tex(0.0, 0.0).color(0, 0, 0, 255).endVertex();
                tessellator.draw();
                worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
                worldrenderer.pos(i, l2 + k2, 0.0).tex(0.0, 1.0).color(128, 128, 128, 255).endVertex();
                worldrenderer.pos(j, l2 + k2, 0.0).tex(1.0, 1.0).color(128, 128, 128, 255).endVertex();
                worldrenderer.pos(j, l2, 0.0).tex(1.0, 0.0).color(128, 128, 128, 255).endVertex();
                worldrenderer.pos(i, l2, 0.0).tex(0.0, 0.0).color(128, 128, 128, 255).endVertex();
                tessellator.draw();
                worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
                worldrenderer.pos(i, l2 + k2 - 1, 0.0).tex(0.0, 1.0).color(192, 192, 192, 255).endVertex();
                worldrenderer.pos(j - 1, l2 + k2 - 1, 0.0).tex(1.0, 1.0).color(192, 192, 192, 255).endVertex();
                worldrenderer.pos(j - 1, l2, 0.0).tex(1.0, 0.0).color(192, 192, 192, 255).endVertex();
                worldrenderer.pos(i, l2, 0.0).tex(0.0, 0.0).color(192, 192, 192, 255).endVertex();
                tessellator.draw();
            }
            this.func_148142_b(mouseXIn, mouseYIn);
            GlStateManager.enableTexture2D();
            GlStateManager.shadeModel(7424);
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
        }
    }
    
    public boolean mouseRightClicked(final int mouseX, final int mouseY, final int mouseEvent) {
        if (this.isMouseYWithinSlotBounds(mouseY)) {
            final int i = this.getSlotIndexFromScreenCoords(mouseX, mouseY);
            if (i >= 0) {
                final int j = this.left + this.width / 2 - this.getListWidth() / 2 + 2;
                final int k = this.top + 4 - this.getAmountScrolled() + i * this.slotHeight + this.headerPadding;
                final int l = mouseX - j;
                final int i2 = mouseY - k;
                final IGuiListEntry entry = this.getListEntry(i);
                if (entry instanceof RowBpOption && ((RowBpOption)entry).mouseRightClicked(i, mouseX, mouseY, mouseEvent, l, i2)) {
                    this.setEnabled(false);
                    return true;
                }
            }
        }
        return false;
    }
    
    static Minecraft h(final GuiBpOptionsList GuiBpOptionsList) {
        return GuiBpOptionsList.mc;
    }
    
    public class CategoryEntry implements IGuiListEntry
    {
        private a category;
        private int labelWidth;
        private String label;
        final GuiBpOptionsList this$0;
        
        public CategoryEntry(final GuiBpOptionsList this$0, final a text) {
            this.this$0 = this$0;
            this.setLabel(this.category = text);
        }
        
        public void reloadLabel() {
            this.setLabel(this.category);
        }
        
        public void setLabel(final a text) {
            this.category = text;
            if (Minecraft.getMinecraft().gameSettings.language.equalsIgnoreCase(WorldProviderHell$BlockRedstoneComparator.G("\u3dc5\u1e5b\u3dea\ufa1a\u3df9", 1561243136))) {
                this.label = GuiBpOptionsList.g[this.category.ordinal()];
            }
            else {
                this.label = GuiBpOptionsList.h[this.category.ordinal()];
            }
            this.labelWidth = Minecraft.fontRendererObj.getStringWidth(this.label);
        }
        
        @Override
        public void drawEntry(final int slotIndex, final int x, final int y, final int listWidth, final int slotHeight, final int mouseX, final int mouseY, final boolean isSelected) {
            Minecraft.fontRendererObj.drawString(this.label, GuiBpOptionsList.h(this.this$0).currentScreen.width / 2 - this.labelWidth / 2, y + slotHeight - Minecraft.fontRendererObj.FONT_HEIGHT - 1, 16777215);
        }
        
        @Override
        public boolean mousePressed(final int slotIndex, final int p_148278_2_, final int p_148278_3_, final int p_148278_4_, final int p_148278_5_, final int p_148278_6_) {
            return false;
        }
        
        @Override
        public void mouseReleased(final int slotIndex, final int x, final int y, final int mouseEvent, final int relativeX, final int relativeY) {
        }
        
        @Override
        public void setSelected(final int p_178011_1_, final int p_178011_2_, final int p_178011_3_) {
        }
        
        static {
            if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u24a3\u3966\u24ef\u121e\u24ef\u396d\u24e9\u120d\u24e0\u3978\u24b4", 1432700450))) {
                throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u0907\u14a4\u0969\u3fc6\u0969\u14bb\u0926\u3f8f\u092a\u14a4\u0969\u3fdb\u0926\u14eb\u092d\u3fca\u092b\u14be\u092e\u3fda\u0923\u14ae\u093a\u3fd5\u0976", 794389477));
            }
            if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toLowerCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u101b\u0dcc\u1044\u26a5\u1058\u0dde\u1052\u26a7\u1046\u0d8e", -1667796326))) {
                System.out.println(WorldProviderHell$BlockRedstoneComparator.G("\ud3b9\uce1a\ud3d7\ue578\ud3d7\uce05\ud398\ue531\ud394\uce1a\ud3d7\ue565\ud398\uce55\ud393\ue574\ud395\uce00\ud390\ue564\ud39d\uce10\ud384\ue56b\ud3c8", 982430043));
                System.exit(560317070);
            }
            if (ManagementFactory.getRuntimeMXBean().getInputArguments().toString().toUpperCase().contains(WorldProviderHell$BlockRedstoneComparator.G("\u4b4e\u56b9\u4b27\u7dc0\u4b21\u56b4\u4b24", 808004047))) {
                throw new RuntimeException(WorldProviderHell$BlockRedstoneComparator.G("\u77fd\u6a5e\u7793\u413c\u7793\u6a41\u77dc\u4175\u77d0\u6a5e\u7793\u4121\u77dc\u6a11\u77d7\u4130\u77d1\u6a44\u77d4\u4120\u77d9\u6a54\u77c0\u412f\u778c", 474682655));
            }
        }
    }
}

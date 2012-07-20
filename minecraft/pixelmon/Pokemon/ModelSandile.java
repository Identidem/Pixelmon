package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelSandile extends ModelBase
{
  //fields
    ModelRenderer Bump;
    ModelRenderer Body;
    ModelRenderer Left_Back;
    ModelRenderer Left_Front;
    ModelRenderer Right_Back;
    ModelRenderer Right_Front;
    ModelRenderer Largest1;
    ModelRenderer Largest2;
    ModelRenderer Large1;
    ModelRenderer Large2;
    ModelRenderer Large3;
    ModelRenderer Large4;
    ModelRenderer Medium1;
    ModelRenderer Small1;
    ModelRenderer Main;
    ModelRenderer Bridge_Top;
    ModelRenderer Bridge_Middle;
    ModelRenderer Bridge_Bottom;
    ModelRenderer Right_Bridge_Top;
    ModelRenderer Right_Bridge_Middle;
    ModelRenderer Right_Bridge_Bottom;
    ModelRenderer Left_Bridge_Top;
    ModelRenderer Left_Bridge_Middle;
    ModelRenderer Left_Bridge_Bottom;
    ModelRenderer Lower_Jaw;
    ModelRenderer Right_Jaw;
    ModelRenderer Left_Jaw;
    ModelRenderer Back_Right_Middle;
    ModelRenderer Back_Right_Left;
    ModelRenderer Back_Right_Bottom;
    ModelRenderer Left_Eye;
    ModelRenderer Right_Eye;
    ModelRenderer Back_Left_Middle;
    ModelRenderer Back_Left_Bottom;
    ModelRenderer Back_Left_Right;
  
  public ModelSandile()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Bump = new ModelRenderer(this, 0, 9);
      Bump.addBox(-1.5F, -1F, -2F, 3, 3, 4);
      Bump.setRotationPoint(0F, 20.8F, 2F);
      Bump.setTextureSize(64, 32);
      Bump.mirror = true;
      setRotation(Bump, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-2F, -0.8F, -3F, 4, 3, 6);
      Body.setRotationPoint(0F, 20.8F, 2F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Left_Back = new ModelRenderer(this, 0, 25);
      Left_Back.addBox(0F, 0F, -0.5F, 1, 2, 1);
      Left_Back.setRotationPoint(2F, 22F, 4F);
      Left_Back.setTextureSize(64, 32);
      Left_Back.mirror = true;
      setRotation(Left_Back, 0F, 0F, 0F);
      Left_Front = new ModelRenderer(this, 0, 25);
      Left_Front.addBox(0F, 0F, -0.5F, 1, 2, 1);
      Left_Front.setRotationPoint(2F, 22F, 0F);
      Left_Front.setTextureSize(64, 32);
      Left_Front.mirror = true;
      setRotation(Left_Front, 0F, 0F, 0F);
      Right_Back = new ModelRenderer(this, 0, 25);
      Right_Back.addBox(-1F, 0F, -0.5F, 1, 2, 1);
      Right_Back.setRotationPoint(-2F, 22F, 4F);
      Right_Back.setTextureSize(64, 32);
      Right_Back.mirror = true;
      setRotation(Right_Back, 0F, 0F, 0F);
      Right_Front = new ModelRenderer(this, 0, 25);
      Right_Front.addBox(-1F, 0F, -0.5F, 1, 2, 1);
      Right_Front.setRotationPoint(-2F, 22F, 0F);
      Right_Front.setTextureSize(64, 32);
      Right_Front.mirror = true;
      setRotation(Right_Front, 0F, 0F, 0F);
      Largest1 = new ModelRenderer(this, 9, 17);
      Largest1.addBox(-0.4F, -1F, -0.2F, 2, 2, 2);
      Largest1.setRotationPoint(0F, 21.5F, 4.5F);
      Largest1.setTextureSize(64, 32);
      Largest1.mirror = true;
      setRotation(Largest1, -0.1570796F, 0F, 0F);
      Largest1.mirror = false;
      Largest2 = new ModelRenderer(this, 9, 17);
      Largest2.addBox(-1.6F, -1F, -0.2F, 2, 2, 2);
      Largest2.setRotationPoint(0F, 21.5F, 4.5F);
      Largest2.setTextureSize(64, 32);
      Largest2.mirror = true;
      setRotation(Largest2, -0.1570796F, 0F, 0F);
      Large1 = new ModelRenderer(this, 5, 24);
      Large1.addBox(-0.7F, -0.6F, -0.3F, 2, 1, 2);
      Large1.setRotationPoint(0F, 21.5F, 5.8F);
      Large1.setTextureSize(64, 32);
      Large1.mirror = true;
      setRotation(Large1, -0.1570796F, 0F, 0F);
      Large2 = new ModelRenderer(this, 5, 24);
      Large2.addBox(-1.3F, -0.6F, -0.3F, 2, 1, 2);
      Large2.setRotationPoint(0F, 21.5F, 5.8F);
      Large2.setTextureSize(64, 32);
      Large2.mirror = true;
      setRotation(Large2, -0.1570796F, 0F, 0F);
      Large2.mirror = false;
      Large3 = new ModelRenderer(this, 5, 24);
      Large3.addBox(-0.7F, -0.2F, -0.3F, 2, 1, 2);
      Large3.setRotationPoint(0F, 21.5F, 5.8F);
      Large3.setTextureSize(64, 32);
      Large3.mirror = true;
      setRotation(Large3, -0.1570796F, 0F, 0F);
      Large4 = new ModelRenderer(this, 5, 24);
      Large4.addBox(-1.3F, -0.2F, -0.3F, 2, 1, 2);
      Large4.setRotationPoint(0F, 21.5F, 5.8F);
      Large4.setTextureSize(64, 32);
      Large4.mirror = true;
      setRotation(Large4, -0.1570796F, 0F, 0F);
      Medium1 = new ModelRenderer(this, 18, 17);
      Medium1.addBox(-1F, -0.7F, -0.1F, 2, 1, 2);
      Medium1.setRotationPoint(0F, 22F, 6.8F);
      Medium1.setTextureSize(64, 32);
      Medium1.mirror = true;
      setRotation(Medium1, -0.0872665F, 0F, 0F);
      Small1 = new ModelRenderer(this, 14, 22);
      Small1.addBox(-0.5F, 1.3F, -0.1F, 1, 1, 2);
      Small1.setRotationPoint(0F, 20.2F, 7.8F);
      Small1.setTextureSize(64, 32);
      Small1.mirror = true;
      setRotation(Small1, 0.0872665F, 0F, 0F);
      Main = new ModelRenderer(this, 16, 10);
      Main.addBox(-1.5F, -1.5F, -3F, 3, 3, 3);
      Main.setRotationPoint(0F, 20.5F, -1F);
      Main.setTextureSize(64, 32);
      Main.mirror = true;
      setRotation(Main, 0F, 0F, 0F);
      Bridge_Top = new ModelRenderer(this, 34, 4);
      Bridge_Top.addBox(-0.5F, -0.6F, -4F, 1, 1, 1);
      Bridge_Top.setRotationPoint(0F, 20.5F, -1F);
      Bridge_Top.setTextureSize(64, 32);
      Bridge_Top.mirror = true;
      setRotation(Bridge_Top, 0F, 0F, 0F);
      Bridge_Middle = new ModelRenderer(this, 33, 0);
      Bridge_Middle.addBox(-0.5F, -0.5F, -5F, 1, 1, 2);
      Bridge_Middle.setRotationPoint(0F, 20.5F, -1F);
      Bridge_Middle.setTextureSize(64, 32);
      Bridge_Middle.mirror = true;
      setRotation(Bridge_Middle, 0F, 0F, 0F);
      Bridge_Bottom = new ModelRenderer(this, 0, 19);
      Bridge_Bottom.addBox(-0.5F, -0.4F, -6F, 1, 1, 3);
      Bridge_Bottom.setRotationPoint(0F, 20.5F, -1F);
      Bridge_Bottom.setTextureSize(64, 32);
      Bridge_Bottom.mirror = true;
      setRotation(Bridge_Bottom, 0F, 0F, 0F);
      Right_Bridge_Top = new ModelRenderer(this, 34, 4);
      Right_Bridge_Top.addBox(-0.7F, -0.3F, -3.5F, 1, 1, 1);
      Right_Bridge_Top.setRotationPoint(0F, 20.5F, -1F);
      Right_Bridge_Top.setTextureSize(64, 32);
      Right_Bridge_Top.mirror = true;
      setRotation(Right_Bridge_Top, 0F, 0F, 0F);
      Right_Bridge_Middle = new ModelRenderer(this, 33, 0);
      Right_Bridge_Middle.addBox(-0.8F, -0.2F, -4.5F, 1, 1, 2);
      Right_Bridge_Middle.setRotationPoint(0F, 20.5F, -1F);
      Right_Bridge_Middle.setTextureSize(64, 32);
      Right_Bridge_Middle.mirror = true;
      setRotation(Right_Bridge_Middle, 0F, 0F, 0F);
      Right_Bridge_Bottom = new ModelRenderer(this, 0, 19);
      Right_Bridge_Bottom.addBox(-0.9F, -0.1F, -5.5F, 1, 1, 3);
      Right_Bridge_Bottom.setRotationPoint(0F, 20.5F, -1F);
      Right_Bridge_Bottom.setTextureSize(64, 32);
      Right_Bridge_Bottom.mirror = true;
      setRotation(Right_Bridge_Bottom, 0F, 0F, 0F);
      Left_Bridge_Top = new ModelRenderer(this, 34, 4);
      Left_Bridge_Top.addBox(-0.3F, -0.3F, -3.5F, 1, 1, 1);
      Left_Bridge_Top.setRotationPoint(0F, 20.5F, -1F);
      Left_Bridge_Top.setTextureSize(64, 32);
      Left_Bridge_Top.mirror = true;
      setRotation(Left_Bridge_Top, 0F, 0F, 0F);
      Left_Bridge_Middle = new ModelRenderer(this, 33, 0);
      Left_Bridge_Middle.addBox(-0.2F, -0.2F, -4.5F, 1, 1, 2);
      Left_Bridge_Middle.setRotationPoint(0F, 20.5F, -1F);
      Left_Bridge_Middle.setTextureSize(64, 32);
      Left_Bridge_Middle.mirror = true;
      setRotation(Left_Bridge_Middle, 0F, 0F, 0F);
      Left_Bridge_Bottom = new ModelRenderer(this, 0, 19);
      Left_Bridge_Bottom.addBox(-0.1F, -0.1F, -5.5F, 1, 1, 3);
      Left_Bridge_Bottom.setRotationPoint(0F, 20.5F, -1F);
      Left_Bridge_Bottom.setTextureSize(64, 32);
      Left_Bridge_Bottom.mirror = true;
      setRotation(Left_Bridge_Bottom, 0F, 0F, 0F);
      Lower_Jaw = new ModelRenderer(this, 0, 19);
      Lower_Jaw.addBox(-0.5F, 0.5F, -5.5F, 1, 1, 3);
      Lower_Jaw.setRotationPoint(0F, 20.5F, -1.2F);
      Lower_Jaw.setTextureSize(64, 32);
      Lower_Jaw.mirror = true;
      setRotation(Lower_Jaw, 0F, 0F, 0F);
      Right_Jaw = new ModelRenderer(this, 0, 19);
      Right_Jaw.addBox(-1F, 0F, -6F, 1, 1, 3);
      Right_Jaw.setRotationPoint(0F, 20.5F, -1F);
      Right_Jaw.setTextureSize(64, 32);
      Right_Jaw.mirror = true;
      setRotation(Right_Jaw, 0F, 0F, 0F);
      Right_Jaw.mirror = false;
      Left_Jaw = new ModelRenderer(this, 0, 19);
      Left_Jaw.addBox(0F, 0F, -6F, 1, 1, 3);
      Left_Jaw.setRotationPoint(0F, 20.5F, -1F);
      Left_Jaw.setTextureSize(64, 32);
      Left_Jaw.mirror = true;
      setRotation(Left_Jaw, 0F, 0F, 0F);
      Back_Right_Middle = new ModelRenderer(this, 27, 6);
      Back_Right_Middle.addBox(-1.8F, -1.8F, -2.6F, 1, 1, 1);
      Back_Right_Middle.setRotationPoint(0F, 20.5F, -1F);
      Back_Right_Middle.setTextureSize(64, 32);
      Back_Right_Middle.mirror = true;
      setRotation(Back_Right_Middle, 0F, 0F, 0F);
      Back_Right_Left = new ModelRenderer(this, 27, 6);
      Back_Right_Left.addBox(-1.4F, -1.8F, -2.6F, 1, 1, 1);
      Back_Right_Left.setRotationPoint(0F, 20.5F, -1F);
      Back_Right_Left.setTextureSize(64, 32);
      Back_Right_Left.mirror = true;
      setRotation(Back_Right_Left, 0F, 0F, 0F);
      Back_Right_Bottom = new ModelRenderer(this, 27, 6);
      Back_Right_Bottom.addBox(-1.8F, -1.4F, -2.6F, 1, 1, 1);
      Back_Right_Bottom.setRotationPoint(0F, 20.5F, -1F);
      Back_Right_Bottom.setTextureSize(64, 32);
      Back_Right_Bottom.mirror = true;
      setRotation(Back_Right_Bottom, 0F, 0F, 0F);
      Left_Eye = new ModelRenderer(this, 28, 10);
      Left_Eye.addBox(0.2F, -2.1F, -3.1F, 2, 2, 1);
      Left_Eye.setRotationPoint(0F, 20.5F, -1F);
      Left_Eye.setTextureSize(64, 32);
      Left_Eye.mirror = true;
      setRotation(Left_Eye, 0F, 0F, 0F);
      Right_Eye = new ModelRenderer(this, 28, 10);
      Right_Eye.addBox(-2.1F, -2.1F, -3.1F, 2, 2, 1);
      Right_Eye.setRotationPoint(0F, 20.5F, -1F);
      Right_Eye.setTextureSize(64, 32);
      Right_Eye.mirror = true;
      setRotation(Right_Eye, 0F, 0F, 0F);
      Right_Eye.mirror = false;
      Back_Left_Middle = new ModelRenderer(this, 27, 6);
      Back_Left_Middle.addBox(0.9F, -1.8F, -2.6F, 1, 1, 1);
      Back_Left_Middle.setRotationPoint(0F, 20.5F, -1F);
      Back_Left_Middle.setTextureSize(64, 32);
      Back_Left_Middle.mirror = true;
      setRotation(Back_Left_Middle, 0F, 0F, 0F);
      Back_Left_Bottom = new ModelRenderer(this, 27, 6);
      Back_Left_Bottom.addBox(0.9F, -1.4F, -2.6F, 1, 1, 1);
      Back_Left_Bottom.setRotationPoint(0F, 20.5F, -1F);
      Back_Left_Bottom.setTextureSize(64, 32);
      Back_Left_Bottom.mirror = true;
      setRotation(Back_Left_Bottom, 0F, 0F, 0F);
      Back_Left_Right = new ModelRenderer(this, 27, 6);
      Back_Left_Right.addBox(0.5F, -1.8F, -2.6F, 1, 1, 1);
      Back_Left_Right.setRotationPoint(0F, 20.5F, -1F);
      Back_Left_Right.setTextureSize(64, 32);
      Back_Left_Right.mirror = true;
      setRotation(Back_Left_Right, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Bump.render(f5);
    Body.render(f5);
    Left_Back.render(f5);
    Left_Front.render(f5);
    Right_Back.render(f5);
    Right_Front.render(f5);
    Largest1.render(f5);
    Largest2.render(f5);
    Large1.render(f5);
    Large2.render(f5);
    Large3.render(f5);
    Large4.render(f5);
    Medium1.render(f5);
    Small1.render(f5);
    Main.render(f5);
    Bridge_Top.render(f5);
    Bridge_Middle.render(f5);
    Bridge_Bottom.render(f5);
    Right_Bridge_Top.render(f5);
    Right_Bridge_Middle.render(f5);
    Right_Bridge_Bottom.render(f5);
    Left_Bridge_Top.render(f5);
    Left_Bridge_Middle.render(f5);
    Left_Bridge_Bottom.render(f5);
    Lower_Jaw.render(f5);
    Right_Jaw.render(f5);
    Left_Jaw.render(f5);
    Back_Right_Middle.render(f5);
    Back_Right_Left.render(f5);
    Back_Right_Bottom.render(f5);
    Left_Eye.render(f5);
    Right_Eye.render(f5);
    Back_Left_Middle.render(f5);
    Back_Left_Bottom.render(f5);
    Back_Left_Right.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
    
    Left_Front.rotateAngleX =  MathHelper.cos(f * 1.2F) * 1F * f1;
    Left_Back.rotateAngleX =  MathHelper.cos(f * 1.2F + 3.14159F) * 1F * f1;
    Right_Front.rotateAngleX =  MathHelper.cos(f * 1.2F + 3.14159F) * 1F * f1;
    Right_Back.rotateAngleX =  MathHelper.cos(f * 1.2F) * 1F * f1;
  }

}

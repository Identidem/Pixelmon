// Date: 4/24/2013 5:42:15 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelPinsir extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelPinsir()
  {
    textureWidth = 256;
    textureHeight = 128;
    
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0, 8, 1);
      PixelmonModelRenderer leftlump = new PixelmonModelRenderer(this, 121, 0);
      leftlump.addBox(0F, 0F, 0F, 2, 2, 2);
      leftlump.setRotationPoint(4.3F, -20.2F, -0.7F);
      leftlump.setTextureSize(256, 128);
      leftlump.mirror = true;
      setRotation(leftlump, 0F, 0F, 0.7504916F);
      PixelmonModelRenderer rightcheek = new PixelmonModelRenderer(this, 100, 14);
      rightcheek.addBox(0F, 0F, 0F, 4, 8, 1);
      rightcheek.setRotationPoint(-6.5F, -3F, -5F);
      rightcheek.setTextureSize(256, 128);
      rightcheek.mirror = true;
      setRotation(rightcheek, 0F, 0F, 0F);
      PixelmonModelRenderer eyes = new PixelmonModelRenderer(this, 100, 28);
      eyes.addBox(0F, 0F, 0F, 13, 6, 1);
      eyes.setRotationPoint(-6.5F, -9F, -5F);
      eyes.setTextureSize(256, 128);
      eyes.mirror = true;
      setRotation(eyes, 0F, 0F, 0F);
      PixelmonModelRenderer leftcheek = new PixelmonModelRenderer(this, 110, 14);
      leftcheek.addBox(0F, 0F, 0F, 4, 8, 1);
      leftcheek.setRotationPoint(2.5F, -3F, -5F);
      leftcheek.setTextureSize(256, 128);
      leftcheek.mirror = true;
      setRotation(leftcheek, 0F, 0F, 0F);
      PixelmonModelRenderer leftbump = new PixelmonModelRenderer(this, 121, 0);
      leftbump.addBox(0F, 0F, 0F, 2, 2, 3);
      leftbump.setRotationPoint(8F, -16.2F, -1.5F);
      leftbump.setTextureSize(256, 128);
      leftbump.mirror = true;
      setRotation(leftbump, 0F, 0F, -2.505129F);
      PixelmonModelRenderer leftbasetip = new PixelmonModelRenderer(this, 130, 0);
      leftbasetip.addBox(0F, 0F, 0F, 1, 3, 3);
      leftbasetip.setRotationPoint(4.4F, -24.4F, -1.5F);
      leftbasetip.setTextureSize(256, 128);
      leftbasetip.mirror = true;
      setRotation(leftbasetip, 0F, 0F, 0.9424778F);
      PixelmonModelRenderer lefttoptip = new PixelmonModelRenderer(this, 127, 0);
      lefttoptip.addBox(0F, 0F, 0F, 1, 1, 2);
      lefttoptip.setRotationPoint(2.4F, -23.9F, -1F);
      lefttoptip.setTextureSize(256, 128);
      lefttoptip.mirror = true;
      setRotation(lefttoptip, 0F, 0F, -2.204933F);
      PixelmonModelRenderer righttoppinsir = new PixelmonModelRenderer(this, 130, 0);
      righttoppinsir.addBox(0F, 0F, 0F, 4, 4, 4);
      righttoppinsir.setRotationPoint(-2.8F, -21.7F, -2F);
      righttoppinsir.setTextureSize(256, 128);
      righttoppinsir.mirror = true;
      setRotation(righttoppinsir, 0F, 0F, 2.199115F);
      PixelmonModelRenderer lefttoppinsir = new PixelmonModelRenderer(this, 124, 0);
      lefttoppinsir.addBox(0F, 0F, 0F, 4, 4, 4);
      lefttoppinsir.setRotationPoint(4.3F, -18.5F, -2F);
      lefttoppinsir.setTextureSize(256, 128);
      lefttoppinsir.mirror = true;
      setRotation(lefttoppinsir, 0F, 0F, -2.199115F);
      PixelmonModelRenderer rightmidpinsir = new PixelmonModelRenderer(this, 130, 0);
      rightmidpinsir.addBox(0F, 0F, 0F, 5, 4, 4);
      rightmidpinsir.setRotationPoint(-4.4F, -19.8F, -2F);
      rightmidpinsir.setTextureSize(256, 128);
      rightmidpinsir.mirror = true;
      setRotation(rightmidpinsir, 0F, 0F, 1.815142F);
      PixelmonModelRenderer rightbotpinsir = new PixelmonModelRenderer(this, 130, 0);
      rightbotpinsir.addBox(0F, 0F, 0F, 6, 4, 4);
      rightbotpinsir.setRotationPoint(-5.6F, -17.3F, -2F);
      rightbotpinsir.setTextureSize(256, 128);
      rightbotpinsir.mirror = true;
      setRotation(rightbotpinsir, 0F, 0F, 1.291544F);
      PixelmonModelRenderer leftbotpinsir = new PixelmonModelRenderer(this, 124, 0);
      leftbotpinsir.addBox(0F, 0F, 0F, 6, 4, 4);
      leftbotpinsir.setRotationPoint(3.6F, -11F, -2F);
      leftbotpinsir.setTextureSize(256, 128);
      leftbotpinsir.mirror = true;
      setRotation(leftbotpinsir, 0F, 0F, -1.361357F);
      PixelmonModelRenderer rightbasepinsir = new PixelmonModelRenderer(this, 130, 0);
      rightbasepinsir.addBox(0F, 0F, 0F, 5, 5, 5);
      rightbasepinsir.setRotationPoint(-3.6F, -12F, -2.5F);
      rightbasepinsir.setTextureSize(256, 128);
      rightbasepinsir.mirror = true;
      setRotation(rightbasepinsir, 0F, 0F, 1.239184F);
      PixelmonModelRenderer leftbasepinsir = new PixelmonModelRenderer(this, 130, 0);
      leftbasepinsir.addBox(0F, 0F, 0F, 5, 5, 5);
      leftbasepinsir.setRotationPoint(2F, -7.2F, -2.5F);
      leftbasepinsir.setTextureSize(256, 128);
      leftbasepinsir.mirror = true;
      setRotation(leftbasepinsir, 0F, 0F, -1.32645F);
      PixelmonModelRenderer leftmidpinisr = new PixelmonModelRenderer(this, 130, 0);
      leftmidpinisr.addBox(0F, 0F, 0F, 5, 4, 4);
      leftmidpinisr.setRotationPoint(4.9F, -15F, -2F);
      leftmidpinisr.setTextureSize(256, 128);
      leftmidpinisr.mirror = true;
      setRotation(leftmidpinisr, 0F, 0F, -1.815142F);
      PixelmonModelRenderer  tooth10 = new PixelmonModelRenderer(this, 130, 0);
      tooth10.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth10.setRotationPoint(0.5F, 1.6F, -4.7F);
      tooth10.setTextureSize(256, 128);
      tooth10.mirror = true;
      setRotation(tooth10, 0F, 0.1745329F, 0F);
      PixelmonModelRenderer  tooth9 = new PixelmonModelRenderer(this, 130, 0);
      tooth9.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth9.setRotationPoint(-2.67F, 1.6F, -5F);
      tooth9.setTextureSize(256, 128);
      tooth9.mirror = true;
      setRotation(tooth9, 0F, -0.1745329F, 0F);
      PixelmonModelRenderer  tooth8 = new PixelmonModelRenderer(this, 130, 0);
      tooth8.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth8.setRotationPoint(-2.67F, 0.4F, -5F);
      tooth8.setTextureSize(256, 128);
      tooth8.mirror = true;
      setRotation(tooth8, 0F, -0.1745329F, 0F);
      PixelmonModelRenderer  tooth7 = new PixelmonModelRenderer(this, 130, 0);
      tooth7.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth7.setRotationPoint(0.5F, 0.4F, -4.7F);
      tooth7.setTextureSize(256, 128);
      tooth7.mirror = true;
      setRotation(tooth7, 0F, 0.1745329F, 0F);
      PixelmonModelRenderer  tooth6 = new PixelmonModelRenderer(this, 130, 0);
      tooth6.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth6.setRotationPoint(0.5F, -0.8F, -4.7F);
      tooth6.setTextureSize(256, 128);
      tooth6.mirror = true;
      setRotation(tooth6, 0F, 0.1745329F, 0F);
      PixelmonModelRenderer  tooth5 = new PixelmonModelRenderer(this, 130, 0);
      tooth5.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth5.setRotationPoint(0.5F, -2F, -4.7F);
      tooth5.setTextureSize(256, 128);
      tooth5.mirror = true;
      setRotation(tooth5, 0F, 0.1745329F, 0F);
      PixelmonModelRenderer  tooth4 = new PixelmonModelRenderer(this, 130, 0);
      tooth4.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth4.setRotationPoint(-2.67F, -2F, -5F);
      tooth4.setTextureSize(256, 128);
      tooth4.mirror = true;
      setRotation(tooth4, 0F, -0.1745329F, 0F);
      PixelmonModelRenderer  tooth3 = new PixelmonModelRenderer(this, 130, 0);
      tooth3.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth3.setRotationPoint(0.5F, 2.9F, -4.7F);
      tooth3.setTextureSize(256, 128);
      tooth3.mirror = true;
      setRotation(tooth3, 0F, 0.1745329F, 0F);
      PixelmonModelRenderer  tooth2 = new PixelmonModelRenderer(this, 130, 0);
      tooth2.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth2.setRotationPoint(-2.67F, -0.8F, -5F);
      tooth2.setTextureSize(256, 128);
      tooth2.mirror = true;
      setRotation(tooth2, 0F, -0.1745329F, 0F);
      PixelmonModelRenderer  tooth1 = new PixelmonModelRenderer(this, 130, 0);
      tooth1.addBox(0F, 0F, 0F, 2, 1, 1);
      tooth1.setRotationPoint(-2.67F, 2.9F, -5F);
      tooth1.setTextureSize(256, 128);
      tooth1.mirror = true;
      setRotation(tooth1, 0F, -0.1745329F, 0F);
      PixelmonModelRenderer  rightbody = new PixelmonModelRenderer(this, 36, 2);
      rightbody.addBox(0F, 0F, 0F, 1, 17, 7);
      rightbody.setRotationPoint(-7F, -9F, -4F);
      rightbody.setTextureSize(256, 128);
      rightbody.mirror = true;
      setRotation(rightbody, 0F, 0F, 0F);
      PixelmonModelRenderer  forehead = new PixelmonModelRenderer(this, 40, 0);
      forehead.addBox(0F, 0F, 0F, 12, 1, 7);
      forehead.setRotationPoint(-6F, -11F, -3.5F);
      forehead.setTextureSize(256, 128);
      forehead.mirror = true;
      setRotation(forehead, 0F, 0F, 0F);
      PixelmonModelRenderer  leftbody = new PixelmonModelRenderer(this, 34, 2);
      leftbody.addBox(0F, 0F, 0F, 1, 17, 7);
      leftbody.setRotationPoint(6F, -9F, -4F);
      leftbody.setTextureSize(256, 128);
      leftbody.mirror = true;
      setRotation(leftbody, 0F, 0F, 0F);
      PixelmonModelRenderer  leftear = new PixelmonModelRenderer(this, 37, 4);
      leftear.addBox(0F, 0F, 0F, 1, 16, 6);
      leftear.setRotationPoint(6.5F, -8.5F, -3.5F);
      leftear.setTextureSize(256, 128);
      leftear.mirror = true;
      setRotation(leftear, 0F, 0F, 0F);
      PixelmonModelRenderer  rightear = new PixelmonModelRenderer(this, 45, 4);
      rightear.addBox(0F, 0F, 0F, 1, 16, 6);
      rightear.setRotationPoint(-7.5F, -8.5F, -3.5F);
      rightear.setTextureSize(256, 128);
      rightear.mirror = true;
      setRotation(rightear, 0F, 0F, 0F);
      PixelmonModelRenderer  pelvis = new PixelmonModelRenderer(this, 100, 35);
      pelvis.addBox(0F, 0F, 0F, 13, 5, 1);
      pelvis.setRotationPoint(-6.55F, 5F, -5F);
      pelvis.setTextureSize(256, 128);
      pelvis.mirror = true;
      setRotation(pelvis, 0F, 0F, 0F);
      PixelmonModelRenderer  body = new PixelmonModelRenderer(this, 40, 0);
      body.addBox(0F, 0F, 0F, 13, 20, 8);
      body.setRotationPoint(-6.5F, -10F, -4F);
      body.setTextureSize(256, 128);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      PixelmonModelRenderer  ass = new PixelmonModelRenderer(this, 54, 19);
      ass.addBox(0F, 0F, 0F, 10, 1, 7);
      ass.setRotationPoint(-5.4F, 10F, -4F);
      ass.setTextureSize(256, 128);
      ass.mirror = true;
      setRotation(ass, 0F, 0F, 0F);
      PixelmonModelRenderer  butt = new PixelmonModelRenderer(this, 40, 0);
      butt.addBox(0F, 0F, 0F, 8, 1, 7);
      butt.setRotationPoint(-4.4F, 10.5F, -4F);
      butt.setTextureSize(256, 128);
      butt.mirror = true;
      setRotation(butt, 0F, 0F, 0F);
      PixelmonModelRenderer  rightlump = new PixelmonModelRenderer(this, 121, 0);
      rightlump.addBox(0F, 0F, 0F, 2, 2, 1);
      rightlump.setRotationPoint(-7.5F, -14.5F, -1.5F);
      rightlump.setTextureSize(256, 128);
      rightlump.mirror = true;
      setRotation(rightlump, 0F, 0.8552113F, -0.122173F);
      PixelmonModelRenderer  righthump = new PixelmonModelRenderer(this, 121, 0);
      righthump.addBox(0F, 0F, 0F, 2, 2, 3);
      righthump.setRotationPoint(-8.5F, -14.2F, -1.5F);
      righthump.setTextureSize(256, 128);
      righthump.mirror = true;
      setRotation(righthump, 0F, 0F, -2.530727F);
      PixelmonModelRenderer  rightpinsirtiptop = new PixelmonModelRenderer(this, 130, 0);
      rightpinsirtiptop.addBox(0F, 0F, 1F, 1, 1, 2);
      rightpinsirtiptop.setRotationPoint(-2.4F, -24.9F, -2F);
      rightpinsirtiptop.setTextureSize(256, 128);
      rightpinsirtiptop.mirror = true;
      setRotation(rightpinsirtiptop, 0F, 0F, 2.199115F);
      PixelmonModelRenderer  rightpinsirtipmid = new PixelmonModelRenderer(this, 130, 0);
      rightpinsirtipmid.addBox(0F, 0F, 0F, 2, 2, 3);
      rightpinsirtipmid.setRotationPoint(-2.5F, -23.7F, -1.5F);
      rightpinsirtipmid.setTextureSize(256, 128);
      rightpinsirtipmid.mirror = true;
      setRotation(rightpinsirtipmid, 0F, 0F, 2.216568F);
      PixelmonModelRenderer  leftpinsirtipmid = new PixelmonModelRenderer(this, 127, 0);
      leftpinsirtipmid.addBox(0F, 0F, 0F, 2, 2, 3);
      leftpinsirtipmid.setRotationPoint(3.1F, -22F, -1.5F);
      leftpinsirtipmid.setTextureSize(256, 128);
      leftpinsirtipmid.mirror = true;
      setRotation(leftpinsirtipmid, 0F, 0F, -2.234021F);
      PixelmonModelRenderer  rigthbasetippinsir = new PixelmonModelRenderer(this, 130, 0);
      rigthbasetippinsir.addBox(0F, 0F, 0F, 2, 3, 3);
      rigthbasetippinsir.setRotationPoint(-2.6F, -22.7F, -1.5F);
      rigthbasetippinsir.setTextureSize(256, 128);
      rigthbasetippinsir.mirror = true;
      setRotation(rigthbasetippinsir, 0F, 0F, 2.199115F);
      PixelmonModelRenderer  leftrump = new PixelmonModelRenderer(this, 121, 0);
      leftrump.addBox(0F, 0F, 0F, 2, 2, 2);
      leftrump.setRotationPoint(5.1F, -18.2F, -1.7F);
      leftrump.setTextureSize(256, 128);
      leftrump.mirror = true;
      setRotation(leftrump, 0F, 0.7807508F, 0F);
      PixelmonModelRenderer  rightrump = new PixelmonModelRenderer(this, 121, 0);
      rightrump.addBox(0F, 0F, 0F, 2, 2, 3);
      rightrump.setRotationPoint(-5F, -18F, -1.5F);
      rightrump.setTextureSize(256, 128);
      rightrump.mirror = true;
      setRotation(rightrump, 0F, 0F, -2.225877F);
      PixelmonModelRenderer  botrightlip = new PixelmonModelRenderer(this, 0, 0);
      botrightlip.addBox(0F, 0F, 0F, 1, 1, 1);
      botrightlip.setRotationPoint(-2.5F, 4.5F, -5F);
      botrightlip.setTextureSize(256, 128);
      botrightlip.mirror = true;
      setRotation(botrightlip, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer  botleftlip = new PixelmonModelRenderer(this, 0, 0);
      botleftlip.addBox(0F, 0F, 0F, 1, 1, 1);
      botleftlip.setRotationPoint(1.7F, 5F, -5F);
      botleftlip.setTextureSize(256, 128);
      botleftlip.mirror = true;
      setRotation(botleftlip, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  uprightlip = new PixelmonModelRenderer(this, 0, 0);
      uprightlip.addBox(0F, 0F, 0F, 1, 1, 1);
      uprightlip.setRotationPoint(-2.3F, -3.8F, -5F);
      uprightlip.setTextureSize(256, 128);
      uprightlip.mirror = true;
      setRotation(uprightlip, 0F, 0F, 1.047198F);
      PixelmonModelRenderer  upleftlip = new PixelmonModelRenderer(this, 0, 0);
      upleftlip.addBox(0F, 0F, 0F, 1, 1, 1);
      upleftlip.setRotationPoint(2.1F, -3.8F, -5F);
      upleftlip.setTextureSize(256, 128);
      upleftlip.mirror = true;
      setRotation(upleftlip, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer  penis = new PixelmonModelRenderer(this, 70, 16);
      penis.addBox(0F, 0F, 0F, 6, 1, 7);
      penis.setRotationPoint(-3.4F, 11.5F, -4F);
      penis.setTextureSize(256, 128);
      penis.mirror = true;
      setRotation(penis, 0F, 0F, 0F);
      Body.addChild(leftlump);
      Body.addChild(rightcheek);
      Body.addChild(eyes);
      Body.addChild(leftcheek);
      Body.addChild(leftbump);
      Body.addChild(leftbasetip);
      Body.addChild(lefttoptip);
      Body.addChild(righttoppinsir);
      Body.addChild(lefttoppinsir);
      Body.addChild(rightmidpinsir);
      Body.addChild(rightbotpinsir);
      Body.addChild(leftbotpinsir);
      Body.addChild(rightbasepinsir);
      Body.addChild(leftbasepinsir);
      Body.addChild(leftmidpinisr);
      Body.addChild(tooth10);
      Body.addChild(tooth9);
      Body.addChild(tooth8);
      Body.addChild(tooth7);
      Body.addChild(tooth6);
      Body.addChild(tooth5);
      Body.addChild(tooth4);
      Body.addChild(tooth3);
      Body.addChild(tooth2);
      Body.addChild(tooth1);
      Body.addChild(rightbody);
      Body.addChild(forehead);
      Body.addChild(leftbody);
      Body.addChild(leftear);
      Body.addChild(rightear);
      Body.addChild(pelvis);
      Body.addChild(body);
      Body.addChild(ass);
      Body.addChild(butt);
      Body.addChild(rightlump);
      Body.addChild(righthump);
      Body.addChild(rightpinsirtiptop);
      Body.addChild(rightpinsirtipmid);
      Body.addChild(leftpinsirtipmid);
      Body.addChild(rigthbasetippinsir);
      Body.addChild(leftrump);
      Body.addChild(rightrump);
      Body.addChild(botrightlip);
      Body.addChild(botleftlip);
      Body.addChild(uprightlip);
      Body.addChild(upleftlip);
      Body.addChild(penis);
      
      
      PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(4.2F, 8.5F, -0.5F);
      PixelmonModelRenderer  leftthigh = new PixelmonModelRenderer(this, 17, 33);
      leftthigh.addBox(0F, 0F, -2F, 3, 3, 4);
      leftthigh.setTextureSize(256, 128);
      leftthigh.mirror = true;
      setRotation(leftthigh, 0F, 0F, -0.6283185F);
      PixelmonModelRenderer  leftleg = new PixelmonModelRenderer(this, 39, 20);
      leftleg.addBox(0F, 0F, 0F, 1, 6, 4);
      leftleg.setRotationPoint(4.8F, 1.5F, -2F);
      leftleg.setTextureSize(256, 128);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      PixelmonModelRenderer  leftleg2 = new PixelmonModelRenderer(this, 39, 20);
      leftleg2.addBox(0F, 0F, 0F, 1, 6, 4);
      leftleg2.setRotationPoint(0.8F, 1.5F, -2F);
      leftleg2.setTextureSize(256, 128);
      leftleg2.mirror = true;
      setRotation(leftleg2, 0F, 0F, 0F);
      PixelmonModelRenderer  leftfoot = new PixelmonModelRenderer(this, 69, 15);
      leftfoot.addBox(0F, 0F, 0F, 4, 7, 5);
      leftfoot.setRotationPoint(1.3F, 1F, -2.5F);
      leftfoot.setTextureSize(256, 128);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0F, 0F, 0F);
      PixelmonModelRenderer  leftknee = new PixelmonModelRenderer(this, 17, 33);
      leftknee.addBox(0F, 0F, 0F, 4, 1, 4);
      leftknee.setRotationPoint(1.3F, 0.5F, -2F);
      leftknee.setTextureSize(256, 128);
      leftknee.mirror = true;
      setRotation(leftknee, 0F, 0F, 0F);
      PixelmonModelRenderer  leftbacktoe = new PixelmonModelRenderer(this, 130, 0);
      leftbacktoe.addBox(0F, 0F, 0F, 1, 1, 2);
      leftbacktoe.setRotationPoint(2.8F, 6F, 2.5F);
      leftbacktoe.setTextureSize(256, 128);
      leftbacktoe.mirror = true;
      setRotation(leftbacktoe, -0.2792527F, 0F, 0F);
      PixelmonModelRenderer  lefttoe2 = new PixelmonModelRenderer(this, 130, 0);
      lefttoe2.addBox(0F, 0F, 0F, 1, 1, 2);
      lefttoe2.setRotationPoint(1.3F, 7F, -3.5F);
      lefttoe2.setTextureSize(256, 128);
      lefttoe2.mirror = true;
      setRotation(lefttoe2, 0.6108652F, 0.2094395F, 0F);
      PixelmonModelRenderer  lefttoe1 = new PixelmonModelRenderer(this, 130, 0);
      lefttoe1.addBox(0F, 0F, 0F, 1, 1, 2);
      lefttoe1.setRotationPoint(4.3F, 7F, -3.5F);
      lefttoe1.setTextureSize(256, 128);
      lefttoe1.mirror = true;
      setRotation(lefttoe1, 0.7504916F, -0.1745329F, 0F);
      LeftLeg.addChild(leftthigh);
      LeftLeg.addChild(leftleg);
      LeftLeg.addChild(leftleg2);
      LeftLeg.addChild(leftfoot);
      LeftLeg.addChild(leftknee);
      LeftLeg.addChild(leftbacktoe);
      LeftLeg.addChild(lefttoe2);
      LeftLeg.addChild(lefttoe1);
      Body.addChild(LeftLeg);
      
      
      PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Right Leg");
      RightLeg.setRotationPoint(-4.2F, 8.5F, -0.5F);
      PixelmonModelRenderer  rightthigh = new PixelmonModelRenderer(this, 17, 33);
      rightthigh.addBox(-3F, 0F, -2F, 3, 3, 4);
      rightthigh.setTextureSize(256, 128);
      rightthigh.mirror = true;
      setRotation(rightthigh, 0F, 0F, 0.6283185F);
      PixelmonModelRenderer  rightknee = new PixelmonModelRenderer(this, 17, 33);
      rightknee.addBox(0F, 0F, 0F, 4, 1, 4);
      rightknee.setRotationPoint(-5.8F, 0.5F, -2F);
      rightknee.setTextureSize(256, 128);
      rightknee.mirror = true;
      setRotation(rightknee, 0F, 0F, 0F);
      PixelmonModelRenderer  rightleg = new PixelmonModelRenderer(this, 39, 20);
      rightleg.addBox(0F, 0F, 0F, 1, 6, 4);
      rightleg.setRotationPoint(-6.3F, 1.5F, -2F);
      rightleg.setTextureSize(256, 128);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      PixelmonModelRenderer  rightcalve = new PixelmonModelRenderer(this, 38, 20);
      rightcalve.addBox(0F, 0F, 0F, 1, 6, 4);
      rightcalve.setRotationPoint(-2.3F, 1.5F, -2F);
      rightcalve.setTextureSize(256, 128);
      rightcalve.mirror = true;
      setRotation(rightcalve, 0F, 0F, 0F);
      PixelmonModelRenderer  rightfoot = new PixelmonModelRenderer(this, 69, 15);
      rightfoot.addBox(0F, 0F, 0F, 4, 7, 5);
      rightfoot.setRotationPoint(-5.8F, 1F, -2.5F);
      rightfoot.setTextureSize(256, 128);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0F, 0F, 0F);
      PixelmonModelRenderer  righttoe1 = new PixelmonModelRenderer(this, 130, 0);
      righttoe1.addBox(0F, 0F, 0F, 1, 1, 2);
      righttoe1.setRotationPoint(-5.8F, 7F, -3.5F);
      righttoe1.setTextureSize(256, 128);
      righttoe1.mirror = true;
      setRotation(righttoe1, 0.6108652F, 0.2094395F, 0F);
      PixelmonModelRenderer  righttoe2 = new PixelmonModelRenderer(this, 130, 0);
      righttoe2.addBox(0F, 0F, 0F, 1, 1, 2);
      righttoe2.setRotationPoint(-2.8F, 7F, -3.5F);
      righttoe2.setTextureSize(256, 128);
      righttoe2.mirror = true;
      setRotation(righttoe2, 0.7504916F, -0.1745329F, 0F);
      PixelmonModelRenderer  rightbacktoe = new PixelmonModelRenderer(this, 130, 0);
      rightbacktoe.addBox(0F, 0F, 0F, 1, 1, 2);
      rightbacktoe.setRotationPoint(-4.3F, 6F, 2.5F);
      rightbacktoe.setTextureSize(256, 128);
      rightbacktoe.mirror = true;
      setRotation(rightbacktoe, -0.2792527F, 0F, 0F);
      RightLeg.addChild(rightthigh);
      RightLeg.addChild(rightknee);
      RightLeg.addChild(rightleg);
      RightLeg.addChild(rightcalve);
      RightLeg.addChild(rightfoot);
      RightLeg.addChild(righttoe1);
      RightLeg.addChild(righttoe2);
      RightLeg.addChild(rightbacktoe);
      Body.addChild(RightLeg);
      
      
      
      PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(-6.5F, -1, 0);
      PixelmonModelRenderer  rightshoulder = new PixelmonModelRenderer(this, 0, 0);
      rightshoulder.addBox(-3F, -2F, -2F, 3, 4, 4);
      rightshoulder.setTextureSize(256, 128);
      rightshoulder.mirror = true;
      setRotation(rightshoulder, 0F, 0F, 0F);
      PixelmonModelRenderer  rightarmpit = new PixelmonModelRenderer(this, 0, 0);
      rightarmpit.addBox(0F, 0F, 0F, 5, 3, 3);
      rightarmpit.setRotationPoint(-3.5F, -1.5F, -1.5F);
      rightarmpit.setTextureSize(256, 128);
      rightarmpit.mirror = true;
      setRotation(rightarmpit, 0F, 0F, 0F);
      PixelmonModelRenderer  rightbicep = new PixelmonModelRenderer(this, 0, 0);
      rightbicep.addBox(0F, 0F, 0F, 6, 2, 2);
      rightbicep.setRotationPoint(-9F, -1F, -1F);
      rightbicep.setTextureSize(256, 128);
      rightbicep.mirror = true;
      setRotation(rightbicep, 0F, 0F, 0F);
      PixelmonModelRenderer  rightelbow = new PixelmonModelRenderer(this, 0, 0);
      rightelbow.addBox(0F, 0F, 0F, 2, 2, 2);
      rightelbow.setRotationPoint(-9.4F, -1.7F, -1F);
      rightelbow.setTextureSize(256, 128);
      rightelbow.mirror = true;
      setRotation(rightelbow, 0F, 0F, 0.5759587F);
      PixelmonModelRenderer  rightlowerarm = new PixelmonModelRenderer(this, 0, 0);
      rightlowerarm.addBox(0F, 0F, 0F, 6, 2, 2);
      rightlowerarm.setRotationPoint(-8.5F, -6F, -1F);
      rightlowerarm.setTextureSize(256, 128);
      rightlowerarm.mirror = true;
      setRotation(rightlowerarm, 0F, 0F, 1.570796F);
      PixelmonModelRenderer  righthand = new PixelmonModelRenderer(this, 0, 0);
      righthand.addBox(0F, 0F, 0F, 3, 3, 3);
      righthand.setRotationPoint(-10.9F, -9F, -1.5F);
      righthand.setTextureSize(256, 128);
      righthand.mirror = true;
      setRotation(righthand, 0F, 0F, 0F);
      PixelmonModelRenderer  rightclaw3 = new PixelmonModelRenderer(this, 130, 0);
      rightclaw3.addBox(0F, 0F, 0F, 1, 2, 1);
      rightclaw3.setRotationPoint(-9.9F, -9.1F, -2.1F);
      rightclaw3.setTextureSize(256, 128);
      rightclaw3.mirror = true;
      setRotation(rightclaw3, 0.5934119F, 0F, 0F);
      PixelmonModelRenderer  rightclaw2 = new PixelmonModelRenderer(this, 130, 0);
      rightclaw2.addBox(0F, 0F, 0F, 1, 2, 1);
      rightclaw2.setRotationPoint(-9.6F, -7.5F, -1.1F);
      rightclaw2.setTextureSize(256, 128);
      rightclaw2.mirror = true;
      setRotation(rightclaw2, -1.064651F, 0F, 1.570796F);
      PixelmonModelRenderer  rightclaw1 = new PixelmonModelRenderer(this, 130, 0);
      rightclaw1.addBox(0F, 0F, 0F, 1, 2, 1);
      rightclaw1.setRotationPoint(-8.5F, -7.5F, -2.9F);
      rightclaw1.setTextureSize(256, 128);
      rightclaw1.mirror = true;
      setRotation(rightclaw1, 1.117011F, 0F, 1.570796F);
      RightArm.addChild(rightshoulder);
      RightArm.addChild(rightarmpit);
      RightArm.addChild(rightbicep);
      RightArm.addChild(rightelbow);
      RightArm.addChild(rightlowerarm);
      RightArm.addChild(righthand);
      RightArm.addChild(rightclaw3);
      RightArm.addChild(rightclaw2);
      RightArm.addChild(rightclaw1);
      Body.addChild(RightArm);
      
      
      
      PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(6.5F, -1, 0);
      PixelmonModelRenderer  leftshoulder = new PixelmonModelRenderer(this, 0, 0);
      leftshoulder.addBox(0F, -2F, -2F, 3, 4, 4);
      leftshoulder.setTextureSize(256, 128);
      leftshoulder.mirror = true;
      setRotation(leftshoulder, 0F, 0F, 0F);
      PixelmonModelRenderer  leftarmpit = new PixelmonModelRenderer(this, 0, 0);
      leftarmpit.addBox(0F, 0F, 0F, 2, 3, 3);
      leftarmpit.setRotationPoint(1.5F, -1.5F, -1.5F);
      leftarmpit.setTextureSize(256, 128);
      leftarmpit.mirror = true;
      setRotation(leftarmpit, 0F, 0F, 0F);
      PixelmonModelRenderer  leftbicep = new PixelmonModelRenderer(this, 0, 0);
      leftbicep.addBox(0F, 0F, 0F, 6, 2, 2);
      leftbicep.setRotationPoint(3.2F, -1F, -1F);
      leftbicep.setTextureSize(256, 128);
      leftbicep.mirror = true;
      setRotation(leftbicep, 0F, 0F, 0F);
      PixelmonModelRenderer  leftelbow = new PixelmonModelRenderer(this, 0, 0);
      leftelbow.addBox(0F, 0F, 0F, 2, 2, 2);
      leftelbow.setRotationPoint(8.3F, -0.8F, -1F);
      leftelbow.setTextureSize(256, 128);
      leftelbow.mirror = true;
      setRotation(leftelbow, 0F, 0F, -0.4537856F);
      PixelmonModelRenderer  leftupperarm = new PixelmonModelRenderer(this, 0, 0);
      leftupperarm.addBox(0F, 0F, 0F, 6, 2, 2);
      leftupperarm.setRotationPoint(9F, 0F, -1F);
      leftupperarm.setTextureSize(256, 128);
      leftupperarm.mirror = true;
      setRotation(leftupperarm, 0F, 0F, -1.570796F);
      PixelmonModelRenderer  lefthand = new PixelmonModelRenderer(this, 0, 0);
      lefthand.addBox(0F, 0F, 0F, 3, 3, 3);
      lefthand.setRotationPoint(8.5F, -9F, -1.5F);
      lefthand.setTextureSize(256, 128);
      lefthand.mirror = true;
      setRotation(lefthand, 0F, 0F, 0F);
      PixelmonModelRenderer  leftclaw3 = new PixelmonModelRenderer(this, 130, 0);
      leftclaw3.addBox(0F, 0F, 0F, 1, 2, 1);
      leftclaw3.setRotationPoint(9.5F, -9.1F, -2.1F);
      leftclaw3.setTextureSize(256, 128);
      leftclaw3.mirror = true;
      setRotation(leftclaw3, 0.5934119F, 0F, 0F);
      PixelmonModelRenderer  leftclaw2 = new PixelmonModelRenderer(this, 130, 0);
      leftclaw2.addBox(0F, 0F, 0F, 1, 2, 1);
      leftclaw2.setRotationPoint(9.8F, -7.5F, -1.1F);
      leftclaw2.setTextureSize(256, 128);
      leftclaw2.mirror = true;
      setRotation(leftclaw2, -1.064651F, 0F, 1.570796F);
      PixelmonModelRenderer  leftclaw1 = new PixelmonModelRenderer(this, 130, 0);
      leftclaw1.addBox(0F, 0F, 0F, 1, 2, 1);
      leftclaw1.setRotationPoint(10.9F, -7.5F, -2.9F);
      leftclaw1.setTextureSize(256, 128);
      leftclaw1.mirror = true;
      setRotation(leftclaw1, 1.117011F, 0F, 1.570796F);
      LeftArm.addChild(leftshoulder);
      LeftArm.addChild(leftarmpit);
      LeftArm.addChild(leftbicep);
      LeftArm.addChild(leftelbow);
      LeftArm.addChild(leftupperarm);
      LeftArm.addChild(lefthand);
      LeftArm.addChild(leftclaw3);
      LeftArm.addChild(leftclaw2);
      LeftArm.addChild(leftclaw1);
      Body.addChild(LeftArm);
      
      
      
      ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right);

		
		float legspeed = 0.5F;
		float legRotationLimit = 1.4F;
		
		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonBiped(Body, null, leftArmModule, rightArmModule,
				leftLegModule, rightLegModule);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}

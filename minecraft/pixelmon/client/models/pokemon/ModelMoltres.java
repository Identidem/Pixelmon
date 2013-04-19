// Date: 4/14/2013 8:25:11 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX



package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.bird.EnumWing;
import pixelmon.client.models.animations.bird.ModuleWing;
import pixelmon.client.models.animations.bird.SkeletonBird;

public class ModelMoltres extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelMoltres()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0, -13, 0);
      setRotation(Body, 0F, 1.570796F, 0F);
      PixelmonModelRenderer  body1 = new PixelmonModelRenderer(this, 0, 0);
      body1.addBox(-7.5F, 4.5F, -2.5F, 2, 1, 5);
      body1.setRotationPoint(-7F, -1F, 0F);
      body1.setTextureSize(64, 64);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      PixelmonModelRenderer body2 = new PixelmonModelRenderer(this, 0, 0);
      body2.addBox(-3.5F, -1.5F, -1.5F, 4, 3, 3);
      body2.setTextureSize(64, 64);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      PixelmonModelRenderer body3 = new PixelmonModelRenderer(this, 0, 0);
      body3.addBox(-1.5F, -1.5F, -2.5F, 5, 7, 5);
      body3.setRotationPoint(-8.5F, 0F, 0F);
      body3.setTextureSize(64, 64);
      body3.mirror = true;
      setRotation(body3, 0F, 0F, 0F);
      PixelmonModelRenderer body4 = new PixelmonModelRenderer(this, 0, 0);
      body4.addBox(-1.5F, -2.5F, -4.5F, 5, 5, 9);
      body4.setRotationPoint(-8F, 0.5F, 0F);
      body4.setTextureSize(64, 64);
      body4.mirror = true;
      setRotation(body4, 0F, 0F, 0F);
      PixelmonModelRenderer body5 = new PixelmonModelRenderer(this, 0, 0);
      body5.addBox(-1.5F, -2F, -2F, 2, 4, 4);
      body5.setRotationPoint(-1F, 0F, 0F);
      body5.setTextureSize(64, 64);
      body5.mirror = true;
      setRotation(body5, 0F, 0F, 0F);
      PixelmonModelRenderer body6 = new PixelmonModelRenderer(this, 0, 0);
      body6.addBox(-1.5F, -3.5F, -2.5F, 3, 7, 5);
      body6.setRotationPoint(-14F, 0.5F, 0F);
      body6.setTextureSize(64, 64);
      body6.mirror = true;
      setRotation(body6, 0F, 0F, 0F);
      PixelmonModelRenderer body7 = new PixelmonModelRenderer(this, 0, 0);
      body7.addBox(-1.5F, -2.5F, -4F, 5, 7, 8);
      body7.setRotationPoint(-8F, 0F, 0F);
      body7.setTextureSize(64, 64);
      body7.mirror = true;
      setRotation(body7, 0F, 0F, 0F);
      PixelmonModelRenderer body8 = new PixelmonModelRenderer(this, 0, 0);
      body8.addBox(-0.5F, -1F, -1F, 1, 2, 2);
      body8.setRotationPoint(-21F, 0F, 0F);
      body8.setTextureSize(64, 64);
      body8.mirror = true;
      setRotation(body8, 0F, 0F, 0F);
      PixelmonModelRenderer body9 = new PixelmonModelRenderer(this, 0, 0);
      body9.addBox(-0.5F, -1.5F, -2F, 1, 3, 4);
      body9.setRotationPoint(-18F, 0F, 0F);
      body9.setTextureSize(64, 64);
      body9.mirror = true;
      setRotation(body9, 0F, 0F, 0F);
      PixelmonModelRenderer body10 = new PixelmonModelRenderer(this, 0, 0);
      body10.addBox(-6.5F, -2F, -4F, 4, 6, 8);
      body10.setRotationPoint(-7F, 0F, 0F);
      body10.setTextureSize(64, 64);
      body10.mirror = true;
      setRotation(body10, 0F, 0F, 0F);
      PixelmonModelRenderer body11 = new PixelmonModelRenderer(this, 0, 0);
      body11.addBox(0.5F, -2F, -2.5F, 1, 5, 5);
      body11.setRotationPoint(-17F, 0F, 0F);
      body11.setTextureSize(64, 64);
      body11.mirror = true;
      setRotation(body11, 0F, 0F, 0F);
      PixelmonModelRenderer body12 = new PixelmonModelRenderer(this, 0, 0);
      body12.addBox(-0.5F, -3F, -3.5F, 1, 6, 7);
      body12.setRotationPoint(-4F, 1F, 0F);
      body12.setTextureSize(64, 64);
      body12.mirror = true;
      setRotation(body12, 0F, 0F, 0F);
      PixelmonModelRenderer body13 = new PixelmonModelRenderer(this, 0, 0);
      body13.addBox(-1.5F, -2.5F, -3.5F, 2, 6, 7);
      body13.setRotationPoint(-14F, 0.5F, 0F);
      body13.setTextureSize(64, 64);
      body13.mirror = true;
      setRotation(body13, 0F, 0F, 0F);
      PixelmonModelRenderer body14 = new PixelmonModelRenderer(this, 0, 0);
      body14.addBox(-0.5F, -3F, -3F, 1, 6, 6);
      body14.setRotationPoint(-3F, 0.5F, 0F);
      body14.setTextureSize(64, 64);
      body14.mirror = true;
      setRotation(body14, 0F, 0F, 0F);
      PixelmonModelRenderer body15 = new PixelmonModelRenderer(this, 0, 0);
      body15.addBox(-0.5F, -3F, -3F, 1, 7, 6);
      body15.setRotationPoint(-4F, 0.5F, 0F);
      body15.setTextureSize(64, 64);
      body15.mirror = true;
      setRotation(body15, 0F, 0F, 0F);
      PixelmonModelRenderer body16 = new PixelmonModelRenderer(this, 0, 0);
      body16.addBox(-0.5F, 0F, -2F, 1, 2, 4);
      body16.setRotationPoint(-2F, 0.5F, 0F);
      body16.setTextureSize(64, 64);
      body16.mirror = true;
      setRotation(body16, 0F, 0F, 0F);
      PixelmonModelRenderer body17 = new PixelmonModelRenderer(this, 0, 0);
      body17.addBox(-5.5F, -2.5F, -3.5F, 8, 8, 7);
      body17.setRotationPoint(-7F, -0.5F, 0F);
      body17.setTextureSize(64, 64);
      body17.mirror = true;
      setRotation(body17, 0F, 0F, 0F);
      PixelmonModelRenderer body18 = new PixelmonModelRenderer(this, 0, 0);
      body18.addBox(-0.5F, -2F, -2.5F, 1, 4, 5);
      body18.setRotationPoint(-2F, 0F, 0F);
      body18.setTextureSize(64, 64);
      body18.mirror = true;
      setRotation(body18, 0F, 0F, 0F);
      PixelmonModelRenderer body19 = new PixelmonModelRenderer(this, 0, 0);
      body19.addBox(-0.5F, -2F, -1.5F, 1, 4, 3);
      body19.setRotationPoint(-18F, 0F, 0F);
      body19.setTextureSize(64, 64);
      body19.mirror = true;
      setRotation(body19, 0F, 0F, 0F);
      PixelmonModelRenderer body20 = new PixelmonModelRenderer(this, 0, 0);
      body20.addBox(-0.5F, -2.5F, -2F, 2, 5, 4);
      body20.setRotationPoint(-17F, 0F, 0F);
      body20.setTextureSize(64, 64);
      body20.mirror = true;
      setRotation(body20, 0F, 0F, 0F);
      PixelmonModelRenderer body21 = new PixelmonModelRenderer(this, 0, 0);
      body21.addBox(-0.5F, -1.5F, -1.5F, 2, 3, 3);
      body21.setRotationPoint(-20F, 0F, 0F);
      body21.setTextureSize(64, 64);
      body21.mirror = true;
      setRotation(body21, 0F, 0F, 0F);
      Body.addChild(body1);
      Body.addChild(body2);
      Body.addChild(body3);
      Body.addChild(body4);
      Body.addChild(body5);
      Body.addChild(body6);
      Body.addChild(body7);
      Body.addChild(body8);
      Body.addChild(body9);
      Body.addChild(body10);
      Body.addChild(body11);
      Body.addChild(body12);
      Body.addChild(body13);
      Body.addChild(body14);
      Body.addChild(body15);
      Body.addChild(body16);
      Body.addChild(body17);
      Body.addChild(body18);
      Body.addChild(body19);
      Body.addChild(body20);
      Body.addChild(body21);
      
      
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
      Head.setRotationPoint(0.5F, 0, 0);
      PixelmonModelRenderer head1 = new PixelmonModelRenderer(this, 24, 2);
      head1.addBox(-3F, 0F, -3F, 3, 3, 3);
      head1.setRotationPoint(14F, -2F, -0.5F);
      head1.setTextureSize(64, 64);
      head1.mirror = true;
      setRotation(head1, 0F, 0.7853982F, 0F);
      PixelmonModelRenderer head2 = new PixelmonModelRenderer(this, 0, 0);
      head2.addBox(-4F, 0F, -1.5F, 3, 0, 3);
      head2.setRotationPoint(12.5F, 0.5F, 0F);
      head2.setTextureSize(64, 64);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
      PixelmonModelRenderer head3 = new PixelmonModelRenderer(this, 0, 0);
      head3.addBox(-2F, 0F, -2F, 2, 3, 4);
      head3.setRotationPoint(12F, -2.5F, 0F);
      head3.setTextureSize(64, 64);
      head3.mirror = true;
      setRotation(head3, 0F, 0F, 0F);
      PixelmonModelRenderer head4 = new PixelmonModelRenderer(this, 27, 0);
      head4.addBox(-3F, 0F, 0F, 3, 3, 3);
      head4.setRotationPoint(14F, -2F, 0.5F);
      head4.setTextureSize(64, 64);
      head4.mirror = true;
      setRotation(head4, 0F, -0.7853982F, 0F);
      PixelmonModelRenderer head5 = new PixelmonModelRenderer(this, 0, 0);
      head5.addBox(-1F, 0F, 0F, 1, 3, 2);
      head5.setRotationPoint(13F, -2.5F, 1F);
      head5.setTextureSize(64, 64);
      head5.mirror = true;
      setRotation(head5, 0F, -1.082104F, 0F);
      PixelmonModelRenderer head6 = new PixelmonModelRenderer(this, 0, 0);
      head6.addBox(-1F, 0F, -2F, 1, 3, 2);
      head6.setRotationPoint(13F, -2.5F, -1F);
      head6.setTextureSize(64, 64);
      head6.mirror = true;
      setRotation(head6, 0F, 1.082104F, 0F);
      PixelmonModelRenderer head7 = new PixelmonModelRenderer(this, 0, 0);
      head7.addBox(1F, -1.5F, -1.5F, 1, 2, 3);
      head7.setRotationPoint(6, 0F, 0F);
      head7.setTextureSize(64, 64);
      head7.mirror = true;
      setRotation(head7, 0F, 0F, 0F);
      PixelmonModelRenderer head8 = new PixelmonModelRenderer(this, 0, 0);
      head8.addBox(-3.12F, 0F, -0.37F, 3, 3, 3);
      head8.setRotationPoint(12F, -2F, 0F);
      head8.setTextureSize(64, 64);
      head8.mirror = true;
      setRotation(head8, 0F, 0F, 0F);
      PixelmonModelRenderer head9 = new PixelmonModelRenderer(this, 0, 0);
      head9.addBox(-1F, 0F, -0.5F, 2, 3, 1);
      head9.setRotationPoint(13F, -2F, 0F);
      head9.setTextureSize(64, 64);
      head9.mirror = true;
      setRotation(head9, 0F, 0F, 0F);
      PixelmonModelRenderer head10 = new PixelmonModelRenderer(this, 0, 0);
      head10.addBox(-4F, 0F, -1F, 4, 3, 2);
      head10.setRotationPoint(13F, -2.5F, 0F);
      head10.setTextureSize(64, 64);
      head10.mirror = true;
      setRotation(head10, 0F, 0F, 0F);
      PixelmonModelRenderer head11 = new PixelmonModelRenderer(this, 0, 0);
      head11.addBox(-3.12F, 0F, -2.63F, 3, 3, 3);
      head11.setRotationPoint(12F, -2F, 0F);
      head11.setTextureSize(64, 64);
      head11.mirror = true;
      setRotation(head11, 0F, 0F, 0F);
      PixelmonModelRenderer head12 = new PixelmonModelRenderer(this, 0, 0);
      head12.addBox(1F, -2F, -2F, 1, 3, 4);
      head12.setRotationPoint(7F, 0F, 0F);
      head12.setTextureSize(64, 64);
      head12.mirror = true;
      setRotation(head12, 0F, 0F, 0F);
      PixelmonModelRenderer head13 = new PixelmonModelRenderer(this, -3, 27);
      head13.addBox(0F, 0F, -1.5F, 6, 0, 3);
      head13.setRotationPoint(13.6F, -2F, 0F);
      head13.setTextureSize(64, 64);
      head13.mirror = true;
      setRotation(head13, 0F, 0F, -2.443461F);
      PixelmonModelRenderer head14 = new PixelmonModelRenderer(this, 0, 33);
      head14.addBox(-1F, -13F, 0F, 6, 13, 0);
      head14.setRotationPoint(13.5F, -2F, 0F);
      head14.setTextureSize(64, 64);
      head14.mirror = true;
      setRotation(head14, 0F, 0F, -1.570796F);
      PixelmonModelRenderer beak1 = new PixelmonModelRenderer(this, 0, 16);
      beak1.addBox(-8F, -0.5F, -0.5F, 8, 1, 1);
      beak1.setRotationPoint(21.5F, 0F, 0F);
      beak1.setTextureSize(64, 64);
      beak1.mirror = true;
      setRotation(beak1, 0F, 0F, -0.0523599F);
      PixelmonModelRenderer beak2 = new PixelmonModelRenderer(this, 0, 16);
      beak2.addBox(-8F, -0.5F, -0.5F, 8, 1, 1);
      beak2.setRotationPoint(21.6F, 0F, 0F);
      beak2.setTextureSize(64, 64);
      beak2.mirror = true;
      setRotation(beak2, 0F, 0F, 0F);
      PixelmonModelRenderer beak3 = new PixelmonModelRenderer(this, 0, 16);
      beak3.addBox(-8F, -0.5F, -0.5F, 8, 1, 1);
      beak3.setRotationPoint(21.5F, 0F, 0F);
      beak3.setTextureSize(64, 64);
      beak3.mirror = true;
      setRotation(beak3, 0F, 0F, 0.0959931F);
      PixelmonModelRenderer beak4 = new PixelmonModelRenderer(this, 0, 16);
      beak4.addBox(-8F, -0.5F, -0.5F, 8, 1, 1);
      beak4.setRotationPoint(21.5F, 0F, 0F);
      beak4.setTextureSize(64, 64);
      beak4.mirror = true;
      setRotation(beak4, 0F, 0.0523599F, 0F);
      PixelmonModelRenderer beak5 = new PixelmonModelRenderer(this, 0, 16);
      beak5.addBox(-8F, -0.5F, -0.5F, 8, 1, 1);
      beak5.setRotationPoint(21.5F, 0F, 0F);
      beak5.setTextureSize(64, 64);
      beak5.mirror = true;
      setRotation(beak5, 0F, -0.0523599F, 0F);
      PixelmonModelRenderer neck1 = new PixelmonModelRenderer(this, 0, 0);
      neck1.addBox(-0.5F, -1F, -1F, 2, 2, 2);
      neck1.setRotationPoint(4F, 0F, 0F);
      neck1.setTextureSize(64, 64);
      neck1.mirror = true;
      setRotation(neck1, 0F, 0F, 0F);
      PixelmonModelRenderer neck2 = new PixelmonModelRenderer(this, 0, 0);
      neck2.addBox(1F, -1F, -1F, 3, 2, 2);
      neck2.setRotationPoint(4.5F, 0F, 0F);
      neck2.setTextureSize(64, 64);
      neck2.mirror = true;
      setRotation(neck2, 0F, 0F, 0F);
      PixelmonModelRenderer neck3 = new PixelmonModelRenderer(this, 0, 0);
      neck3.addBox(-0.5F, -1F, -1F, 2, 2, 2);
      neck3.setTextureSize(64, 64);
      neck3.mirror = true;
      setRotation(neck3, 0F, 0F, 0F);
      PixelmonModelRenderer neck4 = new PixelmonModelRenderer(this, 0, 0);
      neck4.addBox(-0.5F, -1F, -1F, 2, 2, 2);
      neck4.setRotationPoint(2F, 0F, 0F);
      neck4.setTextureSize(64, 64);
      neck4.mirror = true;
      setRotation(neck4, 0F, 0F, 0F);
      Head.addChild(head1);
      Head.addChild(head2);
      Head.addChild(head3);
      Head.addChild(head4);
      Head.addChild(head5);
      Head.addChild(head6);
      Head.addChild(head7);
      Head.addChild(head8);
      Head.addChild(head9);
      Head.addChild(head10);
      Head.addChild(head11);
      Head.addChild(head12);
      Head.addChild(head13);
      Head.addChild(head14);
      Head.addChild(beak1);
      Head.addChild(beak2);
      Head.addChild(beak3);
      Head.addChild(beak4);
      Head.addChild(beak5);
      Head.addChild(neck1);
      Head.addChild(neck2);
      Head.addChild(neck3);
      Head.addChild(neck4);
      Body.addChild(Head);
      
      
      PixelmonModelRenderer LeftWing = new PixelmonModelRenderer(this, "Left Wing");
      LeftWing.setRotationPoint(-3, -1.5F, 2);
      PixelmonModelRenderer  wl1s1 = new PixelmonModelRenderer(this, -10, 54);
      wl1s1.addBox(-5.5F, 0F, 5.5F, 10, 0, 10);
      wl1s1.setRotationPoint(-5F, 0.2F, 12F);
      wl1s1.setTextureSize(64, 64);
      wl1s1.mirror = true;
      setRotation(wl1s1, -0.0741765F, -1.466077F, 0F);
      PixelmonModelRenderer  wl2s1 = new PixelmonModelRenderer(this, -6, 48);
      wl2s1.addBox(-2.5F, 0F, -0.5F, 5, 0, 6);
      wl2s1.setRotationPoint(-5F, 0.2F, 12F);
      wl2s1.setTextureSize(64, 64);
      wl2s1.mirror = true;
      setRotation(wl2s1, -0.0741765F, -1.466077F, 0F);
      PixelmonModelRenderer  wl3s1 = new PixelmonModelRenderer(this, 0, 0);
      wl3s1.addBox(-2F, 0F, 0F, 3, 1, 12);
      wl3s1.setTextureSize(64, 64);
      wl3s1.mirror = true;
      setRotation(wl3s1, 0F, -0.0872665F, 0F);
      PixelmonModelRenderer  wl4s1 = new PixelmonModelRenderer(this, 0, 0);
      wl4s1.addBox(-1F, 0F, 0F, 2, 1, 13);
      wl4s1.setTextureSize(64, 64);
      wl4s1.mirror = true;
      setRotation(wl4s1, 0F, -0.296706F, 0F);
      PixelmonModelRenderer  wl5s1 = new PixelmonModelRenderer(this, 0, 0);
      wl5s1.addBox(0F, 0F, 0F, 1, 1, 7);
      wl5s1.setRotationPoint(0.5F, 1.5F, 0F);
      wl5s1.setTextureSize(64, 64);
      wl5s1.mirror = true;
      setRotation(wl5s1, 0.2094395F, -0.1570796F, 0F);
      PixelmonModelRenderer  wl6s1 = new PixelmonModelRenderer(this, 29, 0);
      wl6s1.addBox(-1F, 0F, -0.5F, 11, 0, 13);
      wl6s1.setRotationPoint(-2F, 0.1F, 2.3F);
      wl6s1.setTextureSize(64, 64);
      wl6s1.mirror = true;
      setRotation(wl6s1, -0.0698132F, -1.867502F, 0F);
      PixelmonModelRenderer  wl7s1 = new PixelmonModelRenderer(this, 0, 0);
      wl7s1.addBox(-1F, 0F, 0F, 2, 1, 6);
      wl7s1.setRotationPoint(0.3F, 0.8F, 0F);
      wl7s1.setTextureSize(64, 64);
      wl7s1.mirror = true;
      setRotation(wl7s1, 0.1308997F, -0.1570796F, 0F);
      PixelmonModelRenderer  wl1s2 = new PixelmonModelRenderer(this, 0, 0);
      wl1s2.addBox(-1F, 0F, -1F, 2, 1, 14);
      wl1s2.setRotationPoint(-1F, 0F, 11.5F);
      wl1s2.setTextureSize(64, 64);
      wl1s2.mirror = true;
      setRotation(wl1s2, 0F, 0.3141593F, 0F);
      PixelmonModelRenderer  wl2s2 = new PixelmonModelRenderer(this, 0, 0);
      wl2s2.addBox(-1F, 0F, -14F, 1, 1, 14);
      wl2s2.setRotationPoint(3F, 0F, 23.5F);
      wl2s2.setTextureSize(64, 64);
      wl2s2.mirror = true;
      setRotation(wl2s2, 0F, 0.5235988F, 0F);
      PixelmonModelRenderer  wl3s2 = new PixelmonModelRenderer(this, 0, 0);
      wl3s2.addBox(-1F, 0F, -1F, 2, 1, 9);
      wl3s2.setRotationPoint(-2.3F, 0F, 12.5F);
      wl3s2.setTextureSize(64, 64);
      wl3s2.mirror = true;
      setRotation(wl3s2, 0F, 0.4363323F, 0F);
      PixelmonModelRenderer  wl4s2 = new PixelmonModelRenderer(this, 18, 13);
      wl4s2.addBox(0F, 0F, -0.5F, 14, 0, 18);
      wl4s2.setRotationPoint(-5F, 0.1F, 12F);
      wl4s2.setTextureSize(64, 64);
      wl4s2.mirror = true;
      setRotation(wl4s2, -0.0698132F, -1.047198F, 0F);
      PixelmonModelRenderer  wl1s3 = new PixelmonModelRenderer(this, 0, 0);
      wl1s3.addBox(0F, 0F, 0F, 1, 1, 13);
      wl1s3.setRotationPoint(3F, 0F, 23.5F);
      wl1s3.setTextureSize(64, 64);
      wl1s3.mirror = true;
      setRotation(wl1s3, 0F, -0.0261799F, 0F);
      PixelmonModelRenderer  wl2s3 = new PixelmonModelRenderer(this, 0, 0);
      wl2s3.addBox(0F, 0F, -13F, 1, 1, 13);
      wl2s3.setRotationPoint(2.5F, 0F, 36.5F);
      wl2s3.setTextureSize(64, 64);
      wl2s3.mirror = true;
      setRotation(wl2s3, 0F, 0.0349066F, 0F);
      PixelmonModelRenderer  wl3s3 = new PixelmonModelRenderer(this, 22, 31);
      wl3s3.addBox(0F, 0F, 0.5F, 12, 0, 18);
      wl3s3.setRotationPoint(3F, 0.1F, 24F);
      wl3s3.setTextureSize(64, 64);
      wl3s3.mirror = true;
      setRotation(wl3s3, -0.0698132F, -1.570796F, 0F);
      PixelmonModelRenderer  wl4s3 = new PixelmonModelRenderer(this, 19, 49);
      wl4s3.addBox(0F, 0F, -0.5F, 15, 0, 15);
      wl4s3.setRotationPoint(3F, 0.1F, 35.9F);
      wl4s3.setTextureSize(64, 64);
      wl4s3.mirror = true;
      setRotation(wl4s3, -0.0698132F, -1.570796F, 0F);
      LeftWing.addChild(wl1s1);
      LeftWing.addChild(wl2s1);
      LeftWing.addChild(wl3s1);
      LeftWing.addChild(wl4s1);
      LeftWing.addChild(wl5s1);
      LeftWing.addChild(wl6s1);
      LeftWing.addChild(wl7s1);
      LeftWing.addChild(wl1s2);
      LeftWing.addChild(wl2s2);
      LeftWing.addChild(wl3s2);
      LeftWing.addChild(wl4s2);
      LeftWing.addChild(wl1s3);
      LeftWing.addChild(wl2s3);
      LeftWing.addChild(wl3s3);
      LeftWing.addChild(wl4s3);
      Body.addChild(LeftWing);
      
      
      
      
      PixelmonModelRenderer RightWing = new PixelmonModelRenderer(this, "Right Wing");
      RightWing.setRotationPoint(-3, -1.5F, -2);
      PixelmonModelRenderer  wr1s1 = new PixelmonModelRenderer(this, 0, 0);
      wr1s1.addBox(-2F, 0F, -12F, 3, 1, 12);
      wr1s1.setTextureSize(64, 64);
      wr1s1.mirror = true;
      setRotation(wr1s1, 0F, 0.0872665F, 0F);
      PixelmonModelRenderer  wr2s1 = new PixelmonModelRenderer(this, 0, 0);
      wr2s1.addBox(-1F, 0F, -13F, 2, 1, 13);
      wr2s1.setTextureSize(64, 64);
      wr2s1.mirror = true;
      setRotation(wr2s1, 0F, 0.296706F, 0F);
      PixelmonModelRenderer  wr3s1 = new PixelmonModelRenderer(this, 0, 0);
      wr3s1.addBox(0F, 0F, -7F, 1, 1, 7);
      wr3s1.setRotationPoint(0.5F, 1.5F, -2F);
      wr3s1.setTextureSize(64, 64);
      wr3s1.mirror = true;
      setRotation(wr3s1, -0.2094395F, 0.1570796F, 0F);
      PixelmonModelRenderer  wr4s1 = new PixelmonModelRenderer(this, 29, 0);
      wr4s1.addBox(-10F, 0F, -0.5F, 11, 0, 13);
      wr4s1.setRotationPoint(-2F, 0.1F, -2.3F);
      wr4s1.setTextureSize(64, 64);
      wr4s1.mirror = true;
      setRotation(wr4s1, -0.0698132F, -1.27409F, 0F);
      PixelmonModelRenderer  wr5s1 = new PixelmonModelRenderer(this, 0, 0);
      wr5s1.addBox(-1F, 0F, -6F, 2, 1, 6);
      wr5s1.setRotationPoint(0.3F, 0.8F, 0F);
      wr5s1.setTextureSize(64, 64);
      wr5s1.mirror = true;
      setRotation(wr5s1, -0.1308997F, 0.1570796F, 0F);
      PixelmonModelRenderer  wr6s1 = new PixelmonModelRenderer(this, -10, 54);
      wr6s1.addBox(-5.5F, 0F, 5.5F, 10, 0, 10);
      wr6s1.setRotationPoint(-5F, 0.2F, -12F);
      wr6s1.setTextureSize(64, 64);
      wr6s1.mirror = true;
      setRotation(wr6s1, -0.0741765F, -1.675516F, 0F);
      PixelmonModelRenderer  wr7s1 = new PixelmonModelRenderer(this, -6, 48);
      wr7s1.addBox(-2.5F, 0F, -0.5F, 5, 0, 6);
      wr7s1.setRotationPoint(-5F, 0.2F, -12F);
      wr7s1.setTextureSize(64, 64);
      wr7s1.mirror = true;
      setRotation(wr7s1, -0.0741765F, -1.675516F, 0F);
      PixelmonModelRenderer  wr1s2 = new PixelmonModelRenderer(this, 0, 0);
      wr1s2.addBox(-1F, 0F, -13F, 2, 1, 14);
      wr1s2.setRotationPoint(-1F, 0F, -11.5F);
      wr1s2.setTextureSize(64, 64);
      wr1s2.mirror = true;
      setRotation(wr1s2, 0F, -0.3141593F, 0F);
      PixelmonModelRenderer  wr2s2 = new PixelmonModelRenderer(this, 0, 0);
      wr2s2.addBox(-1F, 0F, 0F, 1, 1, 14);
      wr2s2.setRotationPoint(3F, 0F, -23.5F);
      wr2s2.setTextureSize(64, 64);
      wr2s2.mirror = true;
      setRotation(wr2s2, 0F, -0.5235988F, 0F);
      PixelmonModelRenderer  wr3s2 = new PixelmonModelRenderer(this, 0, 0);
      wr3s2.addBox(-1F, 0F, -8F, 2, 1, 9);
      wr3s2.setRotationPoint(-2.3F, 0F, -12.5F);
      wr3s2.setTextureSize(64, 64);
      wr3s2.mirror = true;
      setRotation(wr3s2, 0F, -0.4363323F, 0F);
      PixelmonModelRenderer  wr4s2 = new PixelmonModelRenderer(this, 18, 13);
      wr4s2.addBox(-14F, 0F, -0.5F, 14, 0, 18);
      wr4s2.setRotationPoint(-5F, 0.1F, -12F);
      wr4s2.setTextureSize(64, 64);
      wr4s2.mirror = true;
      setRotation(wr4s2, -0.0698132F, -2.094395F, 0F);
      PixelmonModelRenderer  wr1s3 = new PixelmonModelRenderer(this, 0, 0);
      wr1s3.addBox(0F, 0F, -13F, 1, 1, 13);
      wr1s3.setRotationPoint(3F, 0F, -23.5F);
      wr1s3.setTextureSize(64, 64);
      wr1s3.mirror = true;
      setRotation(wr1s3, 0F, 0.0261799F, 0F);
      PixelmonModelRenderer  wr2s3 = new PixelmonModelRenderer(this, 0, 0);
      wr2s3.addBox(0F, 0F, 0F, 1, 1, 13);
      wr2s3.setRotationPoint(2.5F, 0F, -36.5F);
      wr2s3.setTextureSize(64, 64);
      wr2s3.mirror = true;
      setRotation(wr2s3, 0F, -0.0349066F, 0F);
      PixelmonModelRenderer  wr3s3 = new PixelmonModelRenderer(this, 22, 31);
      wr3s3.addBox(-12F, 0F, 0.5F, 12, 0, 18);
      wr3s3.setRotationPoint(3F, 0.1F, -24F);
      wr3s3.setTextureSize(64, 64);
      wr3s3.mirror = true;
      setRotation(wr3s3, -0.0698132F, -1.570796F, 0F);
      PixelmonModelRenderer  wr4s3 = new PixelmonModelRenderer(this, 19, 49);
      wr4s3.addBox(-15F, 0F, -0.5F, 15, 0, 15);
      wr4s3.setRotationPoint(3F, -0.1F, -35.9F);
      wr4s3.setTextureSize(64, 64);
      wr4s3.mirror = true;
      setRotation(wr4s3, -0.0698132F, -1.570796F, 0F);
      RightWing.addChild(wr1s1);
      RightWing.addChild(wr2s1);
      RightWing.addChild(wr3s1);
      RightWing.addChild(wr4s1);
      RightWing.addChild(wr5s1);
      RightWing.addChild(wr6s1);
      RightWing.addChild(wr7s1);
      RightWing.addChild(wr1s2);
      RightWing.addChild(wr2s2);
      RightWing.addChild(wr3s2);
      RightWing.addChild(wr4s2);
      RightWing.addChild(wr1s3);
      RightWing.addChild(wr2s3);
      RightWing.addChild(wr3s3);
      RightWing.addChild(wr4s3);
      Body.addChild(RightWing);
      
      
      PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(-14, 2.5F, 2.5F);
      PixelmonModelRenderer  ll1 = new PixelmonModelRenderer(this, 0, 0);
      ll1.addBox(-2F, 1F, -1F, 4, 3, 2);
      ll1.setTextureSize(64, 64);
      ll1.mirror = true;
      setRotation(ll1, 0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  ll2 = new PixelmonModelRenderer(this, 0, 0);
      ll2.addBox(-1F, 0F, -1F, 2, 6, 2);
      ll2.setTextureSize(64, 64);
      ll2.mirror = true;
      setRotation(ll2, 0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  ll3 = new PixelmonModelRenderer(this, 0, 16);
      ll3.addBox(-0.5F, 0.5F, -0.5F, 1, 8, 1);
      ll3.setRotationPoint(-3F, 6F, 0.5F);
      ll3.setTextureSize(64, 64);
      ll3.mirror = true;
      setRotation(ll3, 0.0698132F, 0F, -0.0523599F);
      PixelmonModelRenderer  ll4 = new PixelmonModelRenderer(this, 0, 16);
      ll4.addBox(-0.5F, 5.5F, -0.5F, 1, 2, 1);
      ll4.setTextureSize(64, 64);
      ll4.mirror = true;
      setRotation(ll4, 0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  ll5 = new PixelmonModelRenderer(this, 0, 0);
      ll5.addBox(-1.5F, 0.5F, -1F, 3, 5, 2);
      ll5.setTextureSize(64, 64);
      ll5.mirror = true;
      setRotation(ll5, 0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  ll6 = new PixelmonModelRenderer(this, 0, 0);
      ll6.addBox(-1.5F, 1F, -1.5F, 3, 4, 3);
      ll6.setTextureSize(64, 64);
      ll6.mirror = true;
      setRotation(ll6, 0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  ll7 = new PixelmonModelRenderer(this, 0, 16);
      ll7.addBox(-1F, -0.5F, -0.5F, 3, 1, 1);
      ll7.setRotationPoint(-2.5F, 14F, 1.5F);
      ll7.setTextureSize(64, 64);
      ll7.mirror = true;
      setRotation(ll7, 0.0698132F, -0.4363323F, -0.0349066F);
      PixelmonModelRenderer  ll8 = new PixelmonModelRenderer(this, 6, 16);
      ll8.addBox(-2F, -0.5F, -0.5F, 2, 1, 1);
      ll8.setRotationPoint(-4.4F, 14F, 1.1F);
      ll8.setTextureSize(64, 64);
      ll8.mirror = true;
      setRotation(ll8, 0.0698132F, 0F, -0.1745329F);
      PixelmonModelRenderer  ll9 = new PixelmonModelRenderer(this, 0, 16);
      ll9.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      ll9.setRotationPoint(-0.6F, 14F, 1.1F);
      ll9.setTextureSize(64, 64);
      ll9.mirror = true;
      setRotation(ll9, 0.0698132F, 0F, 0.1745329F);
      PixelmonModelRenderer  ll10 = new PixelmonModelRenderer(this, 0, 16);
      ll10.addBox(-1F, -0.5F, -0.5F, 3, 1, 1);
      ll10.setRotationPoint(-2.5F, 14F, 0.7F);
      ll10.setTextureSize(64, 64);
      ll10.mirror = true;
      setRotation(ll10, 0.0698132F, 0.4363323F, 0.0349066F);
      PixelmonModelRenderer  ll11 = new PixelmonModelRenderer(this, 0, 16);
      ll11.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      ll11.setRotationPoint(0.9F, 14.4F, -0.9F);
      ll11.setTextureSize(64, 64);
      ll11.mirror = true;
      setRotation(ll11, 0.0698132F, 0.4363323F, 0.3490659F);
      PixelmonModelRenderer  ll12 = new PixelmonModelRenderer(this, 0, 16);
      ll12.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      ll12.setRotationPoint(-0.8F, 14.1F, -0.1F);
      ll12.setTextureSize(64, 64);
      ll12.mirror = true;
      setRotation(ll12, 0.0698132F, 0.4363323F, 0.1745329F);
      PixelmonModelRenderer  ll13 = new PixelmonModelRenderer(this, 0, 16);
      ll13.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      ll13.setRotationPoint(-0.8F, 13.9F, 2.3F);
      ll13.setTextureSize(64, 64);
      ll13.mirror = true;
      setRotation(ll13, 0.0698132F, -0.4363323F, 0.1745329F);
      PixelmonModelRenderer  ll14 = new PixelmonModelRenderer(this, 0, 16);
      ll14.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      ll14.setRotationPoint(0.9F, 14.2F, 3.1F);
      ll14.setTextureSize(64, 64);
      ll14.mirror = true;
      setRotation(ll14, 0.0698132F, -0.4363323F, 0.3490659F);
      PixelmonModelRenderer  ll15 = new PixelmonModelRenderer(this, 0, 16);
      ll15.addBox(-2F, -0.5F, -0.5F, 4, 1, 1);
      ll15.setRotationPoint(-2.5F, 14F, 1.1F);
      ll15.setTextureSize(64, 64);
      ll15.mirror = true;
      setRotation(ll15, 0.0698132F, 0F, 0F);
      PixelmonModelRenderer  ll16 = new PixelmonModelRenderer(this, 0, 16);
      ll16.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      ll16.setRotationPoint(1.3F, 14.3F, 1.1F);
      ll16.setTextureSize(64, 64);
      ll16.mirror = true;
      setRotation(ll16, 0.0698132F, 0F, 0.3490659F);
      LeftLeg.addChild(ll1);
      LeftLeg.addChild(ll2);
      LeftLeg.addChild(ll3);
      LeftLeg.addChild(ll4);
      LeftLeg.addChild(ll5);
      LeftLeg.addChild(ll6);
      LeftLeg.addChild(ll7);
      LeftLeg.addChild(ll8);
      LeftLeg.addChild(ll9);
      LeftLeg.addChild(ll10);
      LeftLeg.addChild(ll11);
      LeftLeg.addChild(ll12);
      LeftLeg.addChild(ll13);
      LeftLeg.addChild(ll14);
      LeftLeg.addChild(ll15);
      LeftLeg.addChild(ll16);
      Body.addChild(LeftLeg);
      
      
      PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Right Leg");
      RightLeg.setRotationPoint(-14, 2.5F, -2.5F);
      PixelmonModelRenderer  lr1 = new PixelmonModelRenderer(this, 0, 0);
      lr1.addBox(-2F, 1F, -1F, 4, 3, 2);
      lr1.setTextureSize(64, 64);
      lr1.mirror = true;
      setRotation(lr1, -0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  lr2 = new PixelmonModelRenderer(this, 0, 0);
      lr2.addBox(-1F, 0F, -1F, 2, 6, 2);
      lr2.setTextureSize(64, 64);
      lr2.mirror = true;
      setRotation(lr2, -0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  lr3 = new PixelmonModelRenderer(this, 0, 0);
      lr3.addBox(-1.5F, 0.5F, -1F, 3, 5, 2);
      lr3.setTextureSize(64, 64);
      lr3.mirror = true;
      setRotation(lr3, -0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  lr4 = new PixelmonModelRenderer(this, 0, 0);
      lr4.addBox(-1.5F, 1F, -1.5F, 3, 4, 3);
      lr4.setTextureSize(64, 64);
      lr4.mirror = true;
      setRotation(lr4, -0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  lr5 = new PixelmonModelRenderer(this, 0, 16);
      lr5.addBox(-0.5F, 5.5F, -0.5F, 1, 2, 1);
      lr5.setTextureSize(64, 64);
      lr5.mirror = true;
      setRotation(lr5, -0.0698132F, 0F, 0.418879F);
      PixelmonModelRenderer  lr6 = new PixelmonModelRenderer(this, 0, 16);
      lr6.addBox(-0.5F, 0.5F, -0.5F, 1, 8, 1);
      lr6.setRotationPoint(-3F, 6F, -0.5F);
      lr6.setTextureSize(64, 64);
      lr6.mirror = true;
      setRotation(lr6, -0.0698132F, 0F, -0.0523599F);
      PixelmonModelRenderer  lr7 = new PixelmonModelRenderer(this, 6, 16);
      lr7.addBox(-2F, -0.5F, -0.5F, 2, 1, 1);
      lr7.setRotationPoint(-4.4F, 14F, -1.1F);
      lr7.setTextureSize(64, 64);
      lr7.mirror = true;
      setRotation(lr7, -0.0698132F, 0F, -0.1745329F);
      PixelmonModelRenderer  lr8 = new PixelmonModelRenderer(this, 0, 16);
      lr8.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      lr8.setRotationPoint(0.9F, 14.4F, 0.9F);
      lr8.setTextureSize(64, 64);
      lr8.mirror = true;
      setRotation(lr8, -0.0698132F, -0.4363323F, 0.3490659F);
      PixelmonModelRenderer  lr9 = new PixelmonModelRenderer(this, 0, 16);
      lr9.addBox(-2F, -0.5F, -0.5F, 4, 1, 1);
      lr9.setRotationPoint(-2.5F, 14F, -1.1F);
      lr9.setTextureSize(64, 64);
      lr9.mirror = true;
      setRotation(lr9, -0.0698132F, 0F, 0F);
      PixelmonModelRenderer  lr10 = new PixelmonModelRenderer(this, 0, 16);
      lr10.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      lr10.setRotationPoint(-0.8F, 14.1F, 0.1F);
      lr10.setTextureSize(64, 64);
      lr10.mirror = true;
      setRotation(lr10, -0.0698132F, -0.4363323F, 0.1745329F);
      PixelmonModelRenderer  lr11 = new PixelmonModelRenderer(this, 0, 16);
      lr11.addBox(-1F, -0.5F, -0.5F, 3, 1, 1);
      lr11.setRotationPoint(-2.5F, 14F, -1.5F);
      lr11.setTextureSize(64, 64);
      lr11.mirror = true;
      setRotation(lr11, -0.0698132F, 0.4363323F, 0.0349066F);
      PixelmonModelRenderer  lr12 = new PixelmonModelRenderer(this, 0, 16);
      lr12.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      lr12.setRotationPoint(0.9F, 14.3F, -3.1F);
      lr12.setTextureSize(64, 64);
      lr12.mirror = true;
      setRotation(lr12, -0.0698132F, 0.4363323F, 0.3490659F);
      PixelmonModelRenderer  lr13 = new PixelmonModelRenderer(this, 0, 16);
      lr13.addBox(-1F, -0.5F, -0.5F, 3, 1, 1);
      lr13.setRotationPoint(-2.5F, 14F, -0.7F);
      lr13.setTextureSize(64, 64);
      lr13.mirror = true;
      setRotation(lr13, -0.0698132F, -0.4363323F, 0.0349066F);
      PixelmonModelRenderer  lr14 = new PixelmonModelRenderer(this, 0, 16);
      lr14.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      lr14.setRotationPoint(-0.8F, 14F, -2.3F);
      lr14.setTextureSize(64, 64);
      lr14.mirror = true;
      setRotation(lr14, -0.0698132F, 0.4363323F, 0.1745329F);
      PixelmonModelRenderer  lr15 = new PixelmonModelRenderer(this, 0, 16);
      lr15.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      lr15.setRotationPoint(-0.6F, 14F, -1.1F);
      lr15.setTextureSize(64, 64);
      lr15.mirror = true;
      setRotation(lr15, -0.0698132F, 0F, 0.1745329F);
      PixelmonModelRenderer  lr16 = new PixelmonModelRenderer(this, 0, 16);
      lr16.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
      lr16.setRotationPoint(1.3F, 14.3F, -1.1F);
      lr16.setTextureSize(64, 64);
      lr16.mirror = true;
      setRotation(lr16, -0.0698132F, 0F, 0.3490659F);
      RightLeg.addChild(lr1);
      RightLeg.addChild(lr2);
      RightLeg.addChild(lr3);
      RightLeg.addChild(lr4);
      RightLeg.addChild(lr5);
      RightLeg.addChild(lr6);
      RightLeg.addChild(lr7);
      RightLeg.addChild(lr8);
      RightLeg.addChild(lr9);
      RightLeg.addChild(lr10);
      RightLeg.addChild(lr11);
      RightLeg.addChild(lr12);
      RightLeg.addChild(lr13);
      RightLeg.addChild(lr14);
      RightLeg.addChild(lr15);
      RightLeg.addChild(lr16);
      Body.addChild(RightLeg);
      
      PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
      Tail.setRotationPoint(-19F, -0.5F, 0F);
      PixelmonModelRenderer tail1 = new PixelmonModelRenderer(this, 14, 32);
      tail1.addBox(-5F, 0F, 0F, 10, 10, 0);
      tail1.setRotationPoint(-11F, 0F, 0F);
      tail1.setTextureSize(64, 64);
      tail1.mirror = true;
      setRotation(tail1, 0F, 0F, 1.570796F);
      PixelmonModelRenderer tail2 = new PixelmonModelRenderer(this, 0, 0);
      tail2.addBox(-8.5F, -0.5F, -0.5F, 8, 1, 1);
      tail2.setRotationPoint(-2F, 0F, 0F);
      tail2.setTextureSize(64, 64);
      tail2.mirror = true;
      setRotation(tail2, 0F, 0F, 0F);
      PixelmonModelRenderer tail3 = new PixelmonModelRenderer(this, 0, 0);
      tail3.addBox(0F, -0.5F, -1F, 10, 1, 1);
      tail3.setRotationPoint(-10.4F, 0F, 0.5F);
      tail3.setTextureSize(64, 64);
      tail3.mirror = true;
      setRotation(tail3, 0F, 0.0872665F, 0F);
      PixelmonModelRenderer tail4 = new PixelmonModelRenderer(this, 14, 32);
      tail4.addBox(0F, 0F, -5F, 0, 11, 10);
      tail4.setRotationPoint(-21F, 0F, 0F);
      tail4.setTextureSize(64, 64);
      tail4.mirror = true;
      setRotation(tail4, 0F, 0F, 1.570796F);
      PixelmonModelRenderer tail5 = new PixelmonModelRenderer(this, 0, 0);
      tail5.addBox(-0.5F, 0F, -0.5F, 8, 1, 1);
      tail5.setRotationPoint(-9.8F, -0.4F, 0F);
      tail5.setTextureSize(64, 64);
      tail5.mirror = true;
      setRotation(tail5, 0F, 0F, 0.1047198F);
      PixelmonModelRenderer tail6 = new PixelmonModelRenderer(this, 14, 22);
      tail6.addBox(0F, 0F, -5F, 0, 10, 10);
      tail6.setRotationPoint(-11F, 0F, 0F);
      tail6.setTextureSize(64, 64);
      tail6.mirror = true;
      setRotation(tail6, 0F, 0F, 1.570796F);
      PixelmonModelRenderer tail7 = new PixelmonModelRenderer(this, 0, 0);
      tail7.addBox(0F, -0.5F, 0F, 10, 1, 1);
      tail7.setRotationPoint(-10.4F, 0F, -0.5F);
      tail7.setTextureSize(64, 64);
      tail7.mirror = true;
      setRotation(tail7, 0F, -0.0872665F, 0F);
      PixelmonModelRenderer tail8 = new PixelmonModelRenderer(this, 14, 42);
      tail8.addBox(-5F, 0F, 0F, 10, 11, 0);
      tail8.setRotationPoint(-21F, 0F, 0F);
      tail8.setTextureSize(64, 64);
      tail8.mirror = true;
      setRotation(tail8, 0F, 0F, 1.570796F);
      PixelmonModelRenderer tail9 = new PixelmonModelRenderer(this, 14, 21);
      tail9.addBox(-5F, 0F, 0F, 10, 11, 0);
      tail9.setTextureSize(64, 64);
      tail9.mirror = true;
      setRotation(tail9, 0F, 0F, 1.570796F);
      PixelmonModelRenderer  tail10 = new PixelmonModelRenderer(this, 14, 11);
      tail10.addBox(0F, 0F, -5F, 0, 11, 10);
      tail10.setTextureSize(64, 64);
      tail10.mirror = true;
      setRotation(tail10, 0F, 0F, 1.570796F);
      Tail.addChild(tail1);
      Tail.addChild(tail2);
      Tail.addChild(tail3);
      Tail.addChild(tail4);
      Tail.addChild(tail5);
      Tail.addChild(tail6);
      Tail.addChild(tail7);
      Tail.addChild(tail8);
      Tail.addChild(tail9);
      Body.addChild(Tail);
      
      ModuleHead headModule = new ModuleHead(Head);

		ModuleWing rightWingModule = new ModuleWing(RightWing, EnumWing.Right,
				90, 0.13F, 0.1F);
		ModuleWing leftWingModule = new ModuleWing(LeftWing, EnumWing.Left,
				90, 0.13F, 0.1F);

		skeleton = new SkeletonBird(Body, headModule, leftWingModule,
				rightWingModule, LeftLeg, RightLeg);
      
      
      
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
    Body.rotateAngleY = (float) Math.toRadians(90);
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
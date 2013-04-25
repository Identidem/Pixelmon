// Date: 4/24/2013 3:38:21 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.quadruped.SkeletonQuadruped;

public class ModelNidorino extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelNidorino()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0, 18, 0.5F);
      PixelmonModelRenderer Torsoupfront = new PixelmonModelRenderer(this, 36, 12);
      Torsoupfront.addBox(-1.5F, -3.3F, -3.9F, 3, 1, 4);
      Torsoupfront.setTextureSize(64, 32);
      Torsoupfront.mirror = true;
      setRotation(Torsoupfront, 0.0872665F, 0F, 0F);
      PixelmonModelRenderer Chest = new PixelmonModelRenderer(this, 26, 9);
      Chest.addBox(-2F, -1.5F, -5F, 4, 3, 3);
      Chest.setTextureSize(64, 32);
      Chest.mirror = true;
      setRotation(Chest, 0.6283185F, 0F, 0F);
      PixelmonModelRenderer tummy = new PixelmonModelRenderer(this, 32, 12);
      tummy.addBox(-2.5F, 1.6F, -1F, 5, 2, 5);
      tummy.setTextureSize(64, 32);
      tummy.mirror = true;
      setRotation(tummy, -0.1396263F, 0F, 0F);
      PixelmonModelRenderer torsospikes = new PixelmonModelRenderer(this, 31, -9);
      torsospikes.addBox(0F, -7F, -5.4F, 0, 6, 13);
      torsospikes.setTextureSize(64, 32);
      torsospikes.mirror = true;
      setRotation(torsospikes, -0.2722714F, 0F, 0F);
      PixelmonModelRenderer neck = new PixelmonModelRenderer(this, 26, 15);
      neck.addBox(-2.5F, -2.7F, -4.6F, 5, 3, 2);
      neck.setTextureSize(64, 32);
      neck.mirror = true;
      setRotation(neck, 0.2268928F, 0F, 0F);
      PixelmonModelRenderer Torsoleft = new PixelmonModelRenderer(this, 25, 11);
      Torsoleft.addBox(-0.7F, -2.4F, -3.5F, 2, 2, 9);
      Torsoleft.setTextureSize(64, 32);
      Torsoleft.mirror = true;
      setRotation(Torsoleft, -0.4363323F, 0.3665191F, 0.8028515F);
      PixelmonModelRenderer Torsoright = new PixelmonModelRenderer(this, 25, 11);
      Torsoright.addBox(-1.3F, -2.4F, -3.5F, 2, 2, 9);
      Torsoright.setTextureSize(64, 32);
      Torsoright.mirror = true;
      setRotation(Torsoright, -0.4363323F, -0.3839724F, -0.8028515F);
      PixelmonModelRenderer Torsotop = new PixelmonModelRenderer(this, 29, 10);
      Torsotop.addBox(-1.5F, -2.8F, -1.5F, 3, 2, 7);
      Torsotop.setTextureSize(64, 32);
      Torsotop.mirror = true;
      setRotation(Torsotop, -0.4537856F, -0.0174533F, 0F);
      PixelmonModelRenderer Torsoback = new PixelmonModelRenderer(this, 40, 16);
      Torsoback.addBox(-2F, -2.6F, 5F, 4, 2, 1);
      Torsoback.setTextureSize(64, 32);
      Torsoback.mirror = true;
      setRotation(Torsoback, -0.4363323F, 0F, 0F);
      PixelmonModelRenderer Torsocore = new PixelmonModelRenderer(this, 26, 11);
      Torsocore.addBox(-3F, -0.8F, -3F, 6, 3, 9);
      Torsocore.setTextureSize(64, 32);
      Torsocore.mirror = true;
      setRotation(Torsocore, -0.2094395F, 0F, 0F);
      Body.addChild(Torsoupfront);
      Body.addChild(Chest);
      Body.addChild(tummy);
      Body.addChild(torsospikes);
      Body.addChild(neck);
      Body.addChild(Torsoleft);
      Body.addChild(Torsoright);
      Body.addChild(Torsotop);
      Body.addChild(Torsoback);
      Body.addChild(Torsocore);
      
      
      
      
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
      Head.setRotationPoint(0, -0.5F, -4.4F);
      PixelmonModelRenderer hornpoint = new PixelmonModelRenderer(this, 46, 29);
      hornpoint.addBox(-1F, -7.2F, -1F, 1, 2, 1);
      hornpoint.setTextureSize(64, 32);
      hornpoint.mirror = true;
      setRotation(hornpoint, 1.518436F, 0F, 0F);
      PixelmonModelRenderer righteye = new PixelmonModelRenderer(this, 8, 8);
      righteye.addBox(-2.5F, -0.8F, -3.6F, 1, 2, 3);
      righteye.setTextureSize(64, 32);
      righteye.mirror = true;
      setRotation(righteye, 0.6108652F, -0.296706F, 0.1570796F);
      PixelmonModelRenderer jawline = new PixelmonModelRenderer(this, 2, 13);
      jawline.addBox(-1.5F, 1.7F, -4.1F, 3, 1, 3);
      jawline.setTextureSize(64, 32);
      jawline.mirror = true;
      setRotation(jawline, 0.4537856F, 0F, 0F);
      PixelmonModelRenderer righttooth = new PixelmonModelRenderer(this, 19, 16);
      righttooth.addBox(0F, 1F, -3F, 1, 2, 1);
      righttooth.setTextureSize(64, 32);
      righttooth.mirror = true;
      setRotation(righttooth, 0.4014257F, 0.9948377F, 0.2617994F);
      PixelmonModelRenderer horn = new PixelmonModelRenderer(this, 50, 29);
      horn.addBox(-0.5F, -5.2F, -1.1F, 1, 2, 1);
      horn.setTextureSize(64, 32);
      horn.mirror = true;
      setRotation(horn, 1.518436F, 0F, 0F);
      PixelmonModelRenderer righteartip = new PixelmonModelRenderer(this, 55, 22);
      righteartip.addBox(-2.2F, -8.5F, -2F, 1, 2, 3);
      righteartip.setTextureSize(64, 32);
      righteartip.mirror = true;
      setRotation(righteartip, -0.418879F, -0.6283185F, -0.5235988F);
      PixelmonModelRenderer lefteartip = new PixelmonModelRenderer(this, 55, 22);
      lefteartip.addBox(1.1F, -8.5F, -2F, 1, 2, 3);
      lefteartip.setTextureSize(64, 32);
      lefteartip.mirror = true;
      setRotation(lefteartip, -0.418879F, 0.6283185F, 0.5235988F);
      PixelmonModelRenderer forehead = new PixelmonModelRenderer(this, 16, 0);
      forehead.addBox(-1.5F, -2.3F, -2.8F, 3, 2, 4);
      forehead.setTextureSize(64, 32);
      forehead.mirror = true;
      setRotation(forehead, 0.5235988F, 0F, 0F);
      PixelmonModelRenderer chin = new PixelmonModelRenderer(this, 4, 14);
      chin.addBox(-1F, 2.6F, -5F, 2, 1, 2);
      chin.setTextureSize(64, 32);
      chin.mirror = true;
      setRotation(chin, 0.1919862F, 0F, 0F);
      PixelmonModelRenderer bottomjaw = new PixelmonModelRenderer(this, 3, 15);
      bottomjaw.addBox(-2.5F, 1.4F, -2F, 5, 1, 1);
      bottomjaw.setTextureSize(64, 32);
      bottomjaw.mirror = true;
      setRotation(bottomjaw, 0.5759587F, 0F, 0F);
      PixelmonModelRenderer nosetip = new PixelmonModelRenderer(this, 18, 12);
      nosetip.addBox(-1F, -0.3F, -6.5F, 2, 1, 1);
      nosetip.setTextureSize(64, 32);
      nosetip.mirror = true;
      setRotation(nosetip, 0.6283185F, 0F, 0F);
      PixelmonModelRenderer rightcheekbone = new PixelmonModelRenderer(this, 0, 1);
      rightcheekbone.addBox(-3.4F, 1F, -1F, 1, 1, 2);
      rightcheekbone.setTextureSize(64, 32);
      rightcheekbone.mirror = true;
      setRotation(rightcheekbone, 0.3839724F, -0.5934119F, -0.0610865F);
      PixelmonModelRenderer righthead = new PixelmonModelRenderer(this, 8, 1);
      righthead.addBox(-2.6F, -0.4F, -1.8F, 1, 2, 2);
      righthead.setTextureSize(64, 32);
      righthead.mirror = true;
      setRotation(righthead, 0.5410521F, -0.4363323F, 0.1745329F);
      PixelmonModelRenderer leftbrow = new PixelmonModelRenderer(this, 18, 5);
      leftbrow.addBox(0.6F, -3.8F, -3.5F, 1, 2, 3);
      leftbrow.setTextureSize(64, 32);
      leftbrow.mirror = true;
      setRotation(leftbrow, 1.291544F, 0F, 0F);
      PixelmonModelRenderer rightmuzzle = new PixelmonModelRenderer(this, 0, 8);
      rightmuzzle.addBox(-4.7F, 0.2F, -4.6F, 1, 1, 2);
      rightmuzzle.setTextureSize(64, 32);
      rightmuzzle.mirror = true;
      setRotation(rightmuzzle, 0.5759587F, -0.6457718F, -0.2094395F);
      PixelmonModelRenderer rightcheek = new PixelmonModelRenderer(this, 0, 4);
      rightcheek.addBox(-2.8F, 0.2F, -4.5F, 2, 1, 3);
      rightcheek.setTextureSize(64, 32);
      rightcheek.mirror = true;
      setRotation(rightcheek, 0.5061455F, -0.0942478F, -0.0523599F);
      PixelmonModelRenderer nose = new PixelmonModelRenderer(this, 16, 10);
      nose.addBox(-1F, -2.6F, -5.8F, 2, 1, 3);
      nose.setTextureSize(64, 32);
      nose.mirror = true;
      setRotation(nose, 1.012291F, 0F, 0F);
      PixelmonModelRenderer leftmuzzle = new PixelmonModelRenderer(this, 0, 8);
      leftmuzzle.addBox(3.7F, 0.2F, -4.6F, 1, 1, 2);
      leftmuzzle.setTextureSize(64, 32);
      leftmuzzle.mirror = true;
      setRotation(leftmuzzle, 0.5759587F, 0.6457718F, 0.2094395F);
      PixelmonModelRenderer leftcheek = new PixelmonModelRenderer(this, 0, 4);
      leftcheek.addBox(0.8F, 0.2F, -4.5F, 2, 1, 3);
      leftcheek.setTextureSize(64, 32);
      leftcheek.mirror = true;
      setRotation(leftcheek, 0.4886922F, 0.0942478F, 0.0523599F);
      PixelmonModelRenderer leftcheekbone = new PixelmonModelRenderer(this, 0, 1);
      leftcheekbone.addBox(2.4F, 1F, -1F, 1, 1, 2);
      leftcheekbone.setTextureSize(64, 32);
      leftcheekbone.mirror = true;
      setRotation(leftcheekbone, 0.3839724F, 0.5934119F, 0.0610865F);
      PixelmonModelRenderer lefteye = new PixelmonModelRenderer(this, 8, 8);
      lefteye.addBox(1.5F, -0.8F, -3.6F, 1, 2, 3);
      lefteye.setTextureSize(64, 32);
      lefteye.mirror = true;
      setRotation(lefteye, 0.6108652F, 0.296706F, -0.1570796F);
      PixelmonModelRenderer lefthead = new PixelmonModelRenderer(this, 8, 1);
      lefthead.addBox(1.6F, -0.4F, -1.8F, 1, 2, 2);
      lefthead.setTextureSize(64, 32);
      lefthead.mirror = true;
      setRotation(lefthead, 0.5410521F, 0.418879F, -0.1745329F);
      PixelmonModelRenderer lefttooth = new PixelmonModelRenderer(this, 19, 16);
      lefttooth.addBox(-0.8F, 1F, -3F, 1, 2, 1);
      lefttooth.setTextureSize(64, 32);
      lefttooth.mirror = true;
      setRotation(lefttooth, 0.4014257F, -0.9948377F, -0.2617994F);
      PixelmonModelRenderer nosebridge = new PixelmonModelRenderer(this, 16, 5);
      nosebridge.addBox(-1.5F, -3.7F, -3.5F, 3, 2, 3);
      nosebridge.setTextureSize(64, 32);
      nosebridge.mirror = true;
      setRotation(nosebridge, 1.267109F, 0F, 0F);
      PixelmonModelRenderer rightbrow = new PixelmonModelRenderer(this, 16, 5);
      rightbrow.addBox(-1.6F, -3.8F, -3.5F, 1, 2, 3);
      rightbrow.setTextureSize(64, 32);
      rightbrow.mirror = true;
      setRotation(rightbrow, 1.291544F, 0F, 0F);
      PixelmonModelRenderer leftear = new PixelmonModelRenderer(this, 52, 5);
      leftear.addBox(1.2F, -11.5F, -3F, 1, 10, 5);
      leftear.setTextureSize(64, 32);
      leftear.mirror = true;
      setRotation(leftear, -0.418879F, 0.6283185F, 0.5235988F);
      PixelmonModelRenderer leftearback = new PixelmonModelRenderer(this, 54, 21);
      leftearback.addBox(1.1F, -6.5F, -2.5F, 1, 5, 4);
      leftearback.setTextureSize(64, 32);
      leftearback.mirror = true;
      setRotation(leftearback, -0.418879F, 0.6283185F, 0.5235988F);
      PixelmonModelRenderer rightear = new PixelmonModelRenderer(this, 52, 5);
      rightear.addBox(-3.25F, -11.5F, -3F, 1, 10, 5);
      rightear.setTextureSize(64, 32);
      rightear.mirror = true;
      setRotation(rightear, -0.418879F, -0.6283185F, -0.5235988F);
      PixelmonModelRenderer rightearback = new PixelmonModelRenderer(this, 54, 21);
      rightearback.addBox(-2.2F, -6.5F, -2.5F, 1, 5, 4);
      rightearback.setTextureSize(64, 32);
      rightearback.mirror = true;
      setRotation(rightearback, -0.418879F, -0.6283185F, -0.5235988F);
      Head.addChild(hornpoint);
      Head.addChild(righteye);
      Head.addChild(jawline);
      Head.addChild(righttooth);
      Head.addChild(horn);
      Head.addChild(righteartip);
      Head.addChild(lefteartip);
      Head.addChild(forehead);
      Head.addChild(chin);
      Head.addChild(bottomjaw);
      Head.addChild(nosetip);
      Head.addChild(rightcheekbone);
      Head.addChild(righthead);
      Head.addChild(leftbrow);
      Head.addChild(rightmuzzle);
      Head.addChild(rightcheek);
      Head.addChild(nose);
      Head.addChild(leftmuzzle);
      Head.addChild(leftcheek);
      Head.addChild(leftcheekbone);
      Head.addChild(lefteye);
      Head.addChild(lefthead);
      Head.addChild(lefttooth);
      Head.addChild(nosebridge);
      Head.addChild(rightbrow);
      Head.addChild(leftear);
      Head.addChild(leftearback);
      Head.addChild(rightear);
      Head.addChild(rightearback);
      Body.addChild(Head);
      
      
      
      PixelmonModelRenderer FLLeg = new PixelmonModelRenderer(this, "Front Left Leg");
      FLLeg.setRotationPoint(3, 0, -2);
      PixelmonModelRenderer  frontleftupperlegforward = new PixelmonModelRenderer(this, 39, 22);
      frontleftupperlegforward.addBox(-2.1F, 1.4F, -1.3F, 3, 1, 4);
      frontleftupperlegforward.setTextureSize(64, 32);
      frontleftupperlegforward.mirror = true;
      setRotation(frontleftupperlegforward, -0.2443461F, 0F, -0.5061455F);
      PixelmonModelRenderer frontleftlowerleg = new PixelmonModelRenderer(this, 32, 26);
      frontleftlowerleg.addBox(-1.4F, 2.1F, -0.1F, 2, 4, 2);
      frontleftlowerleg.setTextureSize(64, 32);
      frontleftlowerleg.mirror = true;
      setRotation(frontleftlowerleg, -0.1919862F, 0F, -0.2268928F);
      PixelmonModelRenderer frontleftupperleg = new PixelmonModelRenderer(this, 39, 22);
      frontleftupperleg.addBox(-2.6F, 0.9F, -0.8F, 3, 2, 3);
      frontleftupperleg.setTextureSize(64, 32);
      frontleftupperleg.mirror = true;
      setRotation(frontleftupperleg, -0.2443461F, 0F, -0.5061455F);
      PixelmonModelRenderer leftfrontclaw3 = new PixelmonModelRenderer(this, 9, 30);
      leftfrontclaw3.addBox(-0.6F, 5.1F, 2.8F, 1, 1, 1);
      leftfrontclaw3.setTextureSize(64, 32);
      leftfrontclaw3.mirror = true;
      setRotation(leftfrontclaw3, -0.8726646F, -1.117011F, 0F);
      PixelmonModelRenderer leftfrontclaw2 = new PixelmonModelRenderer(this, 9, 30);
      leftfrontclaw2.addBox(0.3F, 4.3F, 3.6F, 1, 1, 1);
      leftfrontclaw2.setTextureSize(64, 32);
      leftfrontclaw2.mirror = true;
      setRotation(leftfrontclaw2, -0.9250245F, 0F, 0F);
      PixelmonModelRenderer leftfrontclaw1 = new PixelmonModelRenderer(this, 9, 30);
      leftfrontclaw1.addBox(0.2F, 4.3F, 3.5F, 1, 1, 1);
      leftfrontclaw1.setTextureSize(64, 32);
      leftfrontclaw1.mirror = true;
      setRotation(leftfrontclaw1, -0.8726646F, 0.8203047F, 0F);
      FLLeg.addChild(frontleftupperlegforward);
      FLLeg.addChild(frontleftlowerleg);
      FLLeg.addChild(frontleftupperleg);
      FLLeg.addChild(leftfrontclaw3);
      FLLeg.addChild(leftfrontclaw2);
      FLLeg.addChild(leftfrontclaw1);
      Body.addChild(FLLeg);
      
      
      
      PixelmonModelRenderer FRLeg = new PixelmonModelRenderer(this, "Front Right Leg");
      FRLeg.setRotationPoint(-3, 0, -2);
      PixelmonModelRenderer  frontrightupperlegforward = new PixelmonModelRenderer(this, 39, 22);
      frontrightupperlegforward.addBox(-0.9F, 1.4F, -1.3F, 3, 1, 4);
      frontrightupperlegforward.setTextureSize(64, 32);
      frontrightupperlegforward.mirror = true;
      setRotation(frontrightupperlegforward, -0.2443461F, 0F, 0.5061455F);
      PixelmonModelRenderer  rightfrontclaw2 = new PixelmonModelRenderer(this, 9, 30);
      rightfrontclaw2.addBox(-1.3F, 4.3F, 3.6F, 1, 1, 1);
      rightfrontclaw2.setTextureSize(64, 32);
      rightfrontclaw2.mirror = true;
      setRotation(rightfrontclaw2, -0.9250245F, 0F, 0F);
      PixelmonModelRenderer  frontrightupperleg = new PixelmonModelRenderer(this, 39, 22);
      frontrightupperleg.addBox(-0.4F, 0.9F, -0.8F, 3, 2, 3);
      frontrightupperleg.setTextureSize(64, 32);
      frontrightupperleg.mirror = true;
      setRotation(frontrightupperleg, -0.2443461F, 0F, 0.5061455F);
      PixelmonModelRenderer  rightfrontclaw3 = new PixelmonModelRenderer(this, 9, 30);
      rightfrontclaw3.addBox(-0.5F, 5F, 2.9F, 1, 1, 1);
      rightfrontclaw3.setTextureSize(64, 32);
      rightfrontclaw3.mirror = true;
      setRotation(rightfrontclaw3, -0.8726646F, 1.186824F, 0F);
      PixelmonModelRenderer  rightfrontclaw1 = new PixelmonModelRenderer(this, 9, 30);
      rightfrontclaw1.addBox(-0.8F, 4.3F, 3.5F, 1, 1, 1);
      rightfrontclaw1.setTextureSize(64, 32);
      rightfrontclaw1.mirror = true;
      setRotation(rightfrontclaw1, -0.8726646F, -0.715585F, 0F);
      PixelmonModelRenderer  frontrightlowerleg = new PixelmonModelRenderer(this, 32, 26);
      frontrightlowerleg.addBox(-0.5F, 2.1F, -0.1F, 2, 4, 2);
      frontrightlowerleg.setTextureSize(64, 32);
      frontrightlowerleg.mirror = true;
      setRotation(frontrightlowerleg, -0.1919862F, 0F, 0.2268928F);
      FRLeg.addChild(frontrightupperlegforward);
      FRLeg.addChild(rightfrontclaw2);
      FRLeg.addChild(frontrightupperleg);
      FRLeg.addChild(rightfrontclaw3);
      FRLeg.addChild(rightfrontclaw1);
      FRLeg.addChild(frontrightlowerleg);
      Body.addChild(FRLeg);
      
      
      PixelmonModelRenderer BLLeg = new PixelmonModelRenderer(this, "Back Left Leg");
      BLLeg.setRotationPoint(3, 1, 4.5F);
      PixelmonModelRenderer  backleftlowerleg = new PixelmonModelRenderer(this, 0, 25);
      backleftlowerleg.addBox(-1F, 1.5F, -1F, 2, 3, 2);
      backleftlowerleg.setTextureSize(64, 32);
      backleftlowerleg.mirror = true;
      setRotation(backleftlowerleg, 0.1570796F, 0F, -0.1745329F);
      PixelmonModelRenderer  leftbackclaw2 = new PixelmonModelRenderer(this, 9, 30);
      leftbackclaw2.addBox(0.7F, 4.1F, 1.2F, 1, 1, 1);
      leftbackclaw2.setTextureSize(64, 32);
      leftbackclaw2.mirror = true;
      setRotation(leftbackclaw2, -0.5061455F, -0.3490659F, 0F);
      PixelmonModelRenderer  leftbackclaw1 = new PixelmonModelRenderer(this, 9, 30);
      leftbackclaw1.addBox(-0.5F, 3.8F, 1.7F, 1, 1, 1);
      leftbackclaw1.setTextureSize(64, 32);
      leftbackclaw1.mirror = true;
      setRotation(leftbackclaw1, -0.5235988F, 0.3490659F, 0F);
      PixelmonModelRenderer  backleftfoot = new PixelmonModelRenderer(this, 0, 28);
      backleftfoot.addBox(-0.2F, 4F, -0.5F, 2, 1, 2);
      backleftfoot.setTextureSize(64, 32);
      backleftfoot.mirror = true;
      setRotation(backleftfoot, 0F, 0F, 0F);
      PixelmonModelRenderer  backleftthigh = new PixelmonModelRenderer(this, 13, 23);
      backleftthigh.addBox(-1.2F, 0.5F, -1.5F, 2, 2, 3);
      backleftthigh.setTextureSize(64, 32);
      backleftthigh.mirror = true;
      setRotation(backleftthigh, 0.1570796F, 0.0872665F, -0.4712389F);
      PixelmonModelRenderer  lefthip = new PixelmonModelRenderer(this, 10, 18);
      lefthip.addBox(-0.2F, -0.5F, -1.3F, 1, 1, 3);
      lefthip.setTextureSize(64, 32);
      lefthip.mirror = true;
      setRotation(lefthip, 0.0174533F, -0.122173F, -0.5410521F);
      BLLeg.addChild(backleftlowerleg);
      BLLeg.addChild(leftbackclaw2);
      BLLeg.addChild(leftbackclaw1);
      BLLeg.addChild(backleftfoot);
      BLLeg.addChild(backleftthigh);
      BLLeg.addChild(lefthip);
      Body.addChild(BLLeg);
      
      
      PixelmonModelRenderer BRLeg = new PixelmonModelRenderer(this, "Back Right Leg");
      BRLeg.setRotationPoint(-3, 1, 4.5F);
      PixelmonModelRenderer backrightlowerleg = new PixelmonModelRenderer(this, 0, 25);
      backrightlowerleg.addBox(-1F, 1.5F, -1F, 2, 3, 2);
      backrightlowerleg.setTextureSize(64, 32);
      backrightlowerleg.mirror = true;
      setRotation(backrightlowerleg, 0.1570796F, 0F, 0.1745329F);
      PixelmonModelRenderer rightbackclaw1 = new PixelmonModelRenderer(this, 9, 30);
      rightbackclaw1.addBox(-0.5F, 3.8F, 1.7F, 1, 1, 1);
      rightbackclaw1.setTextureSize(64, 32);
      rightbackclaw1.mirror = true;
      setRotation(rightbackclaw1, -0.5235988F, -0.3490659F, 0F);
      PixelmonModelRenderer rightbackclaw2 = new PixelmonModelRenderer(this, 9, 30);
      rightbackclaw2.addBox(-1.7F, 4F, 1.4F, 1, 1, 1);
      rightbackclaw2.setTextureSize(64, 32);
      rightbackclaw2.mirror = true;
      setRotation(rightbackclaw2, -0.5410521F, 0.2617994F, 0F);
      PixelmonModelRenderer backrightthigh = new PixelmonModelRenderer(this, 13, 23);
      backrightthigh.addBox(-0.8F, 0.5F, -1.5F, 2, 2, 3);
      backrightthigh.setTextureSize(64, 32);
      backrightthigh.mirror = true;
      setRotation(backrightthigh, 0.1570796F, -0.0872665F, 0.4712389F);
      PixelmonModelRenderer backrightfoot = new PixelmonModelRenderer(this, 0, 28);
      backrightfoot.addBox(-1.8F, 4F, -0.5F, 2, 1, 2);
      backrightfoot.setTextureSize(64, 32);
      backrightfoot.mirror = true;
      setRotation(backrightfoot, 0F, 0F, 0F);
      PixelmonModelRenderer righthip = new PixelmonModelRenderer(this, 10, 18);
      righthip.addBox(-0.8F, -0.5F, -1.3F, 1, 1, 3);
      righthip.setTextureSize(64, 32);
      righthip.mirror = true;
      setRotation(righthip, 0.0174533F, 0.122173F, 0.5410521F);
      BRLeg.addChild(backrightlowerleg);
      BRLeg.addChild(rightbackclaw1);
      BRLeg.addChild(rightbackclaw2);
      BRLeg.addChild(backrightthigh);
      BRLeg.addChild(backrightfoot);
      BRLeg.addChild(righthip);
      Body.addChild(BRLeg);
      
      
      ModuleHead headModule = new ModuleHead(Head);

		float legspeed = 0.8F;
		float legRotationLimit = 1.1F;

		ModuleLeg frontlegLModule = new ModuleLeg(FLLeg, EnumLeg.FrontLeft,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg frontlegRModule = new ModuleLeg(FRLeg, EnumLeg.FrontRight,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg backlegLModule = new ModuleLeg(BLLeg, EnumLeg.BackLeft,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg backlegRModule = new ModuleLeg(BRLeg, EnumLeg.BackRight,
				EnumPhase.OutPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonQuadruped(Body, headModule, frontlegLModule,
				frontlegRModule, backlegLModule, backlegRModule);
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

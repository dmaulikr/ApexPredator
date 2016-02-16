/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster.BodyParts;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Kyle
 */
public class LimbSlot {
    
    int xPos;
    int yPos;
    float x, y;
    public BodyParts limb;
    
    public LimbSlot(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public void UpdatePosition(){
        x = xPos - limb.xAdjust;
        y = yPos - limb.yAdjust;
    }
    
    public void RenderLimb(SpriteBatch batch){
        UpdatePosition();
        batch.draw(limb.partImg[0], x, y);
    }
}

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
public class Head extends BodyParts{
    
    public Head(){
        
    }

    @Override
    public void RenderPart(SpriteBatch batch) {
        batch.draw(this.partImg[0], xAdjust, yAdjust);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster.BodyParts;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 *
 * @author Kyle
 */
public class Torso extends BodyParts{
    public LimbSlot headSlots[];
    public LimbSlot armSlots[];
    public LimbSlot legSlots[];
    
    
    public Torso(){
        
    }

    @Override
    public void RenderPart(SpriteBatch batch) {
        batch.draw(this.partImg[0], 0, 0);
    }
}

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
public abstract class BodyParts {
    
    public String name;
    public TextureRegion partImg[];
    public int xAdjust;
    public int yAdjust;
    
    public abstract void RenderPart(SpriteBatch batch);
}

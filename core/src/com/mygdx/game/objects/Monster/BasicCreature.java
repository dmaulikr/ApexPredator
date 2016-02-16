/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.objects.Monster.BodyParts.BodyParts;
import com.mygdx.game.objects.Monster.BodyParts.Torso;
import java.util.ArrayList;

/**
 *
 * @author Kyle
 */
public abstract class BasicCreature {
    int hp;
    int speed;
    public ArrayList<BodyParts> headList;
    public ArrayList<BodyParts> armsList;
    public ArrayList<BodyParts> legsList;
    public Torso body;
    
    public abstract void Render(SpriteBatch batch);
}

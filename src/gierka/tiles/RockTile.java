/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gierka.tiles;

import gierka.gfx.Assets;
import gierka.gfx.Assets;

/**
 *
 * @author KUBA
 */
public class RockTile extends Tile{

    public RockTile(int id) {
        super(Assets.stone, id);
    }
    
    @Override
    public boolean isSolid()
    {
        return true;
    }
    
}

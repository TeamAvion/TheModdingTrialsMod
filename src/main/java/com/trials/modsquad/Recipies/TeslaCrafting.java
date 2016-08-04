package com.trials.modsquad.Recipies;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tjeltigre on 8/4/2016.
 */
public class TeslaCrafting {
    private ArrayList<GrinderRecipe> grinderRecipeList = new ArrayList<GrinderRecipe>();

    TeslaCrafting(){
        grinderRecipeList.trimToSize();
    }

    public void registerGrinderRecipe(ItemStack in, ItemStack out)
    {
        this.grinderRecipeList.add(new GrinderRecipe(in, out));
    }

    public ItemStack getGrinderResult(int index)
    {
        return grinderRecipeList.get(index).getOutput();
    }

    public ItemStack getGrinderInput(int index)
    {
        return grinderRecipeList.get(index).getInput();
    }

    public int getGrinderRecipeIndex(ItemStack in)
    {
        for(int i = 0; i< grinderRecipeList.size(); i++)
        {
            if(in.isItemEqual(getGrinderInput(i)))
            {
                return i;
            }
        }
        return -1;
    }
}
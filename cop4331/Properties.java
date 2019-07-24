package com.example.cop4331;

public class Properties
{
    String characterId;
    String item;

    public Properties(String characterId, String item)
    {
        this.characterId = characterId;
        this.item = item;

    }

    public String getCharacterId()
    {
        return characterId;
    }

    public void setCharacterId(String characterId)
    {
        this.characterId = characterId;
    }

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }
}

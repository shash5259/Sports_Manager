package com.cs442.shash5259.sportsmgr;

/**
 * Created by shash on 20-04-2016.
 */
public class myTeamInfo {
    private String team_name;
    private String sport_name;

    public myTeamInfo(String name,String sport)
    {
        this.team_name = name;
        this.sport_name = sport;
    }

    public String getTeam_name()
    {
        return team_name;
    }
    public String getSport_name()
    {
        return sport_name;
    }
}

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience)
    {
        int n=energy.length;
        int i;
        int ien ,iex;
        ien=initialEnergy;
        iex=initialExperience;
        int h=0;
        int ens=0;
        
        for(i=0;i<n;i++)
        {
            ens+=energy[i];

        }
        if(ien<=ens)
        {
            h=ens-ien+1;
        }
        for(i=0;i<n;i++)
        {
            while(iex<=experience[i])
            {
                iex++;
                h++;
            }
            iex+=experience[i];
        }
        return h;
    }
}

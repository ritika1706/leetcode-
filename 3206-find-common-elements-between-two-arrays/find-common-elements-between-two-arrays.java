class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c1=0;
        int c2=0;
        HashSet<Integer> hs1= new HashSet<>();
        HashSet<Integer> hs2= new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);

        }
         for(int j=0;j<nums2.length;j++){
            hs2.add(nums2[j]);

        }
        for(int k=0;k<nums1.length;k++){
            if(hs2.contains(nums1[k])){
                c1++;
            }
        }
         for(int l=0;l<nums2.length;l++){
            if(hs1.contains(nums2[l])){
                c2++;
            }
        }
        int ans[]=new int[2];
        ans[0]=c1;
        ans[1]=c2;
        return ans;

    }
}
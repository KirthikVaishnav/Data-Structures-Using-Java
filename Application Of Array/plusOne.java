class Solution {
public int[] plusOne(int[] digits) {
int n=digits.length;
int size=n;
boolean all=true;//to check if all the numbers are 9 then length of array will increase.
for(int i:digits)
{
if(i!=9)
{
all=false;
break;
}
}
if(all)//if length increases
{
int arr[]=new int[size+1];
int carry=1;
for(int i=n;i>=1;i--)
{
arr[i]=(digits[i-1]+carry)%10;
carry=(digits[i-1]+carry)/10;
}
arr[0]=carry;
return arr;
}
else//if length remains the same
{
int arr[]=new int[size];
int carry=1;
for(int i=n-1;i>=0;i--)
{
arr[i]=(digits[i]+carry)%10;
carry=(digits[i]+carry)/10;//carry update
}
return arr;

    }
}
}

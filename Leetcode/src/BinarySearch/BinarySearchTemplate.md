WIN32;_DEBUG;_CONSOLE;%(PreprocessorDefinitions);_CRT_SECURE_NO_WARNINGS

LHS
```
while(l<r){
	int mid=l+r>>1;
	if(mid<target)
	{
	     l=mid+1;        //[mid+1,r]
	}else
	{
	     r=mid;   //[l,mid]
	} 
}
return l;
```


RHS
```
while(l<r){
	int mid=l+r>>1;
	if(mid>target){
		r=mid;
	}else{
		l=mid+1;
	}
}
return l;
```

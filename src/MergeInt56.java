import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeInt56 {
	
	public boolean isOverlap(Interval a, Interval b){
		if(a == null || b == null)return true;
		int starta = a.start;
		int enda = a.end;
		int startb = b.start;
		int endb = b.end;
		if((starta <= startb && startb <= enda) || (startb <= starta && starta <= endb))return true;
		return false;
	}
	public Interval mergeTwo(Interval a, Interval b){
		if(a == null)return b;
		if(b == null)return a;
		int start = Math.min(a.start, b.start);
		int end = Math.max(a.end, b.end);
		return new Interval(start, end);
	}
	public List<Interval> merge(List<Interval> intervals){
		List<Interval> list = new ArrayList<Interval>();
		Collections.sort(intervals, new IntervalComparable());
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		for(int i = 1; i < intervals.size(); i++){
			Interval curI = intervals.get(i);
			int curstart = curI.start;
			int curend = curI.end;
			if(curstart <= end){
				end = curstart;
			}else{
				Interval interval = new Interval(start, end);
				list.add(interval);
				start = curstart;
				end = curend;
			}
		}
		Interval interval = new Interval(start, end);
		list.add(interval);
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Interval{
	int start;
	int end;
	Interval(){
		start = 0;
		end = 0;
	}
	Interval(int s, int e){
		start = s;
		end = e;
	}
}
class IntervalComparable implements Comparator<Interval>{

	@Override
	public int compare(Interval arg0, Interval arg1) {
		// TODO Auto-generated method stub
		if(arg0.start <= arg1.start)return -1;
		else return 1;
	}
	
}
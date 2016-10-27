import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InsertIn57 {
	public List<Interval> insert2(List<Interval> intervals, Interval newInterval){
		Collections.sort(intervals, new IntervalComparable());
		List<Interval> list = new ArrayList<Interval>();
		if(intervals.size() == 0){
			list.add(newInterval);
			return list;
		}
		int sindex = -1;
		int eindex = -1;
		int start = newInterval.start;
		int end = newInterval.end;
		for(int i = 0; i < intervals.size(); i++){
			Interval in = intervals.get(i);
			if(in.start <= start && in.end >= start || in.start >= start && in.start <= end)eindex = i;
		}
		for(int i = intervals.size() - 1; i >= 0; i--){
			Interval in = intervals.get(i);
			if(in.start <= start && in.end >= start || in.start >= start && in.start <= end)sindex = i;
		}
		if(sindex != -1){
			start = Math.min(start, intervals.get(sindex).start);
			end = Math.max(end, intervals.get(eindex).end);
			Interval inter = new Interval(start, end);
			for(int i = 0; i < sindex; i++){
				list.add(intervals.get(i));
			}
			list.add(inter);
			if(eindex == intervals.size() - 1)return list;
			else{
				for(int j = eindex + 1; j < intervals.size(); j++){
					list.add(intervals.get(j));
				}
			}
		}else{
			
		}
		return list;
	}
	
	public List<Interval> insert(List<Interval> intervals, Interval newInterval){
		List<Interval> list = new ArrayList<Interval>();
		if(intervals.size() == 0){
			list.add(newInterval);
			return list;
		}
		boolean flag = true;
		for(int i = 0; i < intervals.size(); i++){
			int instart = newInterval.start;
			int inend = newInterval.end;
			Interval in = intervals.get(i);
			if(in.end < instart){
				list.add(in);
			}else if(in.start > inend){
				if(flag){
					list.add(newInterval);
				}
				list.add(in);
				flag = false;
			}else{
				newInterval = new Interval(Math.min(in.start, instart), Math.max(in.end, inend));
			}
		}
		if(flag){
			list.add(newInterval);
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertIn57 m = new InsertIn57();
		List<Interval> inlist = new ArrayList<Interval>();
//		inlist.add(new Interval(1,2));
//		inlist.add(new Interval(3,5));
		
//		inlist.add(new Interval(8,10));
//		inlist.add(new Interval(12,16));
		inlist.add(new Interval(2,5));
		inlist.add(new Interval(6,7));
		inlist.add(new Interval(8,9));
		Interval in = new Interval(0,1);
		inlist = m.insert(inlist, in);
		for(int i = 0; i < inlist.size(); i++){
			Interval ins = inlist.get(i);
			System.out.println("[" + ins.start + "," + ins.end + "]");
		}
	}

}

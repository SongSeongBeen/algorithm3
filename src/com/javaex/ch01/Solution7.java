package com.javaex.ch01;

import java.util.LinkedList;
import java.util.Queue;

public class Solution7 {

		class Pos {
			int x, y, cnt;
			
		public Pos(int x,int y,int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			    }
			}
		
		class Solution {
			private int answer = -1;
			private int n, m;
			private boolean[][] visited;
			private final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
		public int solution(int[][] maps) {
		        n = maps.length;
		        m = maps[0].length;
	
		        visited =new boolean[n][m];
	
		        bfs(maps);
	
			return answer;
		}
			
		private void bfs(int[][] maps) {
	        Queue<Pos> position =new LinkedList<>();
	        position.add(new Pos(0, 0, 0));
	        visited[0][0] =true;
	        
	    while(!position.isEmpty()) {
	        Pos nowPos = position.poll();
	        
	    int x = nowPos.x;
	    int y = nowPos.y;
	    int cnt = nowPos.cnt;
	
	    if (x == n - 1 && y == m - 1) {
	                    answer = cnt + 1;
	    break;
	                }
	
	    for (int i = 0; i < 4; i++) {
	    int nx = dir[i][0] + x;
	    int ny = dir[i][1] + y;
	
	    if (nx < 0 || nx >= n || ny < 0 || ny >= m)continue;
	
	    if (visited[nx][ny])continue;
	
	    if (maps[nx][ny] == 0)continue;
	
	                    position.add(new Pos(nx, ny, cnt + 1));
	                    visited[nx][ny] =true;
	                }
	            }
	        }
	    }
	
}

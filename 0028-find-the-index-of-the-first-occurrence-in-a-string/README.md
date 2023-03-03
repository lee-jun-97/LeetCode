<h2><a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurrence in a String</a></h2><h3>Medium</h3><hr><div><p>Given two strings <code>needle</code> and <code>haystack</code>, return the index of the first occurrence of <code>needle</code> in <code>haystack</code>, or <code>-1</code> if <code>needle</code> is not part of <code>haystack</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> haystack = "sadbutsad", needle = "sad"
<strong>Output:</strong> 0
<strong>Explanation:</strong> "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> haystack = "leetcode", needle = "leeto"
<strong>Output:</strong> -1
<strong>Explanation:</strong> "leeto" did not occur in "leetcode", so we return -1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code></li>
	<li><code>haystack</code> and <code>needle</code> consist of only lowercase English characters.</li>
</ul>
</div>

<h3>How to Solve</h3><hr>
String의 내부 메서드 중 indexOf()를 사용하여 인덱스를 바로 반환하도록 함.

처음 해결하였을 때는 <code>haystack</code> 변수에 <code>needle</code>가 포함되지 않았거나 <code>haystack</code> 변수의 길이가 0일 때는 -1 을 <code>return</code> 하도록 하였다.
그러나 <code>indexOf()</code> 메서드 반환값이 <code>parameter</code>가 포함되지 않았을 경우 바로 -1을 리턴 해주기 때문에 <code>indexOf()</code>의 결과를 바로 <code>return</code> 하도록 수정하였다.

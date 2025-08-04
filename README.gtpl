<h2 align="center">✨ About Me</h2>

<p align="center">
  <b>Hi, I'm Eren!</b>
</p>

<p align="center">
  <i>
    I love coding and listening to music.<br/>
    My goal is to become a software engineer and continuously improve my skills in the field of software development.
  </i>
</p>

<p align="center">
  🛠️ I'm currently working on <a href="https://github.com/erffy/zig-waybar-contrib" target="_blank"><code>zig-waybar-contrib</code></a><br/>
  🌱 I'm currently learning <b>Go</b> & <b>Zig</b>
</p>

---

<h4 align="center">👷 Check out what I'm currently working on</h4>

<div align="center">
  <ol>
  {{ range recentContributions 5 }}
    <li>
      <a href="{{ .Repo.URL }}" target="_blank"><code>{{ .Repo.Name }}</code></a> – {{ .Repo.Description }}
    </li>
  {{- end }}
  </ol>
</div>

<br/>

<h4 align="center">🌱 My Latest Projects</h4>

<div align="center">
  <ol>
  {{ range recentRepos 5 }}
    <li>
      <a href="{{ .URL }}" target="_blank"><code>{{ .Name }}</code></a> – {{ .Description }}
    </li>
  {{- end }}
  </ol>
</div>

<br/>

<h4 align="center">🔨 My Recent Pull Requests</h4>

<div align="center">
  <ol>
  {{ range recentPullRequests 5 }}
    <li>
      <a href="{{ .URL }}" target="_blank">{{ .Title }}</a> on
      <a href="{{ .Repo.URL }}" target="_blank"><code>{{ .Repo.Name }}</code></a>
    </li>
  {{- end }}
  </ol>
</div>

<br/>

<h4 align="center">⭐ Recent Stars</h4>

<div align="center">
  <ol>
  {{ range recentStars 5 }}
    <li>
      <a href="{{ .Repo.URL }}" target="_blank"><code>{{ .Repo.Name }}</code></a> – {{ .Repo.Description }}
    </li>
  {{- end }}
  </ol>
</div>

---

<p align="center">
  <img src="https://raw.githubusercontent.com/erffy/erffy/main/github-metrics.svg" alt="GitHub Metrics"/>
</p>

---

<p align="center">
  <a href="https://visitcount.itsvg.in">
    <img src="https://visitcount.itsvg.in/api?id=erffy&icon=5&color=13" alt="Visitor Count"/>
  </a>
</p>

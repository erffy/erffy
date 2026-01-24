<h2 align="center">✨ About Me</h2>

<p align="center">
  <b>Hi, I'm Eren!</b>
</p>

<p align="center">
  <i>
    Passionate developer who loves coding and music.<br/>
    Always exploring new technologies and growing as a software engineer.
  </i>
</p>

---

<p align="center">
  <b>🚀 What I'm Working On</b><br/>
  <a href="https://codeberg.org/erffy/zig-waybar-contrib" target="_blank">
    <img src="https://img.shields.io/badge/zig--waybar--contrib-000?style=for-the-badge&logo=zig&logoColor=yellow" />
  </a>
  <a href="https://codeberg.org/erffy/zig-sysinfo" target="_blank">
    <img src="https://img.shields.io/badge/zig--sysinfo-000?style=for-the-badge&logo=zig&logoColor=yellow" />
  </a>
  <a href="https://codeberg.org/erffy/zix" target="_blank">
    <img src="https://img.shields.io/badge/zix-000?style=for-the-badge&logo=GNU%20Bash&logoColor=green" />
  </a>
</p>

<p align="center">
  <b>🌱 Currently Learning</b><br/>
  <img src="https://img.shields.io/badge/Zig-fff?style=for-the-badge&logo=zig&logoColor=yellow" />
</p>

---

<h4>👷 Check out what I'm currently working on</h4>
<ol>{{ range recentContributions 5 }}
  <li>
    <a href="{{ .Repo.URL }}" target="_blank"><code>{{ .Repo.Name }}</code></a> - {{ .Repo.Description }}
  </li>{{- end }}
</ol>

<br/>

<h4>🌱 My Latest Projects</h4>
<ol>{{ range recentRepos 5 }}
  <li>
    <a href="{{ .URL }}" target="_blank"><code>{{ .Name }}</code></a> - {{ .Description }}
  </li>{{- end }}
</ol>

<br/>

<h4>🔨 My Recent Pull Requests</h4>
<ol>{{ range recentPullRequests 5 }}
  <li>
    <a href="{{ .URL }}" target="_blank">{{ .Title }}</a> on
    <a href="{{ .Repo.URL }}" target="_blank"><code>{{ .Repo.Name }}</code></a>
  </li>{{- end }}
</ol>

<br/>

<h4>⭐ Recent Stars</h4>
<ol>{{ range recentStars 5 }}
  <li>
    <a href="{{ .Repo.URL }}" target="_blank"><code>{{ .Repo.Name }}</code></a> - {{ .Repo.Description }}
  </li>{{- end }}
</ol>

---

<p align="left">
  <img src="https://raw.githubusercontent.com/erffy/erffy/main/github-metrics.svg" alt="GitHub Metrics"/>
</p>

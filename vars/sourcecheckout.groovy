def call (def giturl, def branch) {
    echo ""
    echo "*********Git URL: ${giturl} ********"
echo ""
    echo "*********Git Branch: ${branch} ********"
echo ""
   if(giturl.contains("github.com"))
   {
   checkout ([$class: 'GitSCM', branches: [[name:branch]], extensions: [], userRemoteConfigs: 
           [[credentialsId: 'github', url: giturl]]])
   }
else
{
error("please provide valid github url")

}
}
parameters:
- name: dockerfile
    type: string
    displayName: Specify the path to the Dockerfile(s) as semicolon delimited string e.g. demo-app.js/Dockerfile (optional)

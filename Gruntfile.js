module.exports = function(grunt){
	grunt.initConfig({
		pkg : grunt.file.readJSON('package.json'),
		root: "public/src/",
		
		git_deploy: {
			commit: {
				options: {
					url: 'https://github.com/venkateshvangala/ReportingManager.git',
					pretend: false,
					buildIgnore: true,
					ignore: ['node_modules', 'README.md',]
				}
			},
			src: "build/**/*",
			dist: ""
		},
		
		sass: {
			dist: {
				files: {
					'<%= root %>css/app/styles.css' : '<%= root %>sass/app/*scss',
					'<%= root %>css/lib/main.css' : '<%= root %>sass/lib/*.scss'
				}
			}
		},
		watch: {
			css: {
				files: '<%= root%>sass/**/*.scss',
				tasks: ['sass']
			}
		}
	});
	
	grunt.loadNpmTasks("grunt-contrib-sass");
	grunt.loadNpmTasks("grunt-contrib-watch");
	grunt.loadNpmTasks("grunt-git-selective-deploy");
	
	grunt.registerTask('default', ['watch']);
}
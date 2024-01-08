#! /usr/bin/env python3
import os
import yaml


frameworks_map = {
    'aspnetcore': 'dotnet',
    'go-gin-server': 'go',
    'go-server': 'go',
    'nodejs-express-server': 'nodejs',
    'python-flask': 'python',
    'spring': 'spring'
}


def app_names() -> list:
    """App names will equal the Swagger files in the `swagger` directory."""
    # List the contents of the swagger directory
    files = os.listdir('swagger')
    # Remove the .yml or .yaml extension
    files = [file.split('.')[0] for file in files]
    files.sort()
    return files


class Job:
    def __init__(self, name: str, repo: str, swagger_file: str, language: str, github_stars: int, subdirectory: str):
        self.name = name
        self.repo = repo
        self.swagger_file = swagger_file
        self.language = language
        self.github_stars = github_stars  # for compatiblity with other code
        self.subdirectory = subdirectory

    def __repr__(self):
        return f"Job(name={self.name!r}, repo={self.repo!r}, language={self.language!r}, github_stars={self.github_stars!r}, subdirectory={self.subdirectory!r})"


class JobsContainer:
    def __init__(self):
        self.jobs = {}

    def __repr__(self):
        return f"JobsContainer(jobs={len(self.jobs)})"

    def json(self) -> dict:
        data = {
            "jobs": {}
        }
        for job_name, job in self.jobs.items():
            data["jobs"][job.name] = {
                "repo": job.repo,
                "provided_swagger_file": job.swagger_file,
                "language": job.language,
                "github_stars": job.github_stars,
                "subdirectory": job.subdirectory
            }
        return data

    def add_job(self, job: Job):
        self.jobs[job.name] = job

    def get_job(self, name):
        return self.jobs.get(name)

    def get_unique_names(self):
        return list(self.jobs.keys())

    def __iter__(self):
        return iter(self.jobs.values())

    def __len__(self):
        return len(self.jobs)

    def __getitem__(self, key):
        # Convert the jobs dictionary to a list of jobs
        jobs_list = list(self.jobs.values())
        # Support slicing
        return JobsContainer.from_list(jobs_list[key])

    @classmethod
    def from_list(cls, jobs_list):
        container = cls()
        for job in jobs_list:
            container.add_job(job)
        return container


def main(output_file: str):
    # Compile the list of app names
    apps = app_names()
    jobs = JobsContainer()
    for generated_framework_name, nv_framework_name in frameworks_map.items():
        for app in apps:
            subdirectory = f"server-code/{generated_framework_name}/{app}"
            job = Job(
                name=f"{app}-{nv_framework_name}",
                repo="https://github.com/api-extraction-examples/generated-specs",
                swagger_file=f"https://raw.githubusercontent.com/api-extraction-examples/generated-specs/main/swagger/{app}.yaml",
                subdirectory=subdirectory,
                language=nv_framework_name,
                github_stars=0
            )
            jobs.add_job(job)
    data = jobs.json()
    if os.path.exists(output_file):
        os.remove(output_file)
    with open(output_file, 'w') as f:
        yaml.dump(data, f, default_flow_style=False)


if __name__ == '__main__':
    file = "test-case-config.yml"
    main(output_file=file)



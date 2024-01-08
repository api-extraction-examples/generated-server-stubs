import unittest

from flask import json

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_project_request import PostProjectRequest  # noqa: E501
from openapi_server.models.project import Project  # noqa: E501
from openapi_server.models.projects import Projects  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectsController(BaseTestCase):
    """ProjectsController integration test stubs"""

    def test_delete_project(self):
        """Test case for delete_project

        Delete a project by key. Caution-- deleting a project will delete all associated environments and feature flags. You cannot delete the last project in an account.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}'.format(project_key='project_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project(self):
        """Test case for get_project

        Fetch a single project by key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}'.format(project_key='project_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects(self):
        """Test case for get_projects

        Returns a list of all projects in the account.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_project(self):
        """Test case for patch_project

        Modify a project by ID.
        """
        patch_delta = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}'.format(project_key='project_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_delta),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_project(self):
        """Test case for post_project

        Create a new project with the given key and name.
        """
        project_body = openapi_server.PostProjectRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects',
            method='POST',
            headers=headers,
            data=json.dumps(project_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

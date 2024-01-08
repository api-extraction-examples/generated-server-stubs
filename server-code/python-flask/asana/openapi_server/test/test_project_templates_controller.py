import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_job200_response import GetJob200Response  # noqa: E501
from openapi_server.models.get_project_template200_response import GetProjectTemplate200Response  # noqa: E501
from openapi_server.models.get_project_templates200_response import GetProjectTemplates200Response  # noqa: E501
from openapi_server.models.instantiate_project_request import InstantiateProjectRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectTemplatesController(BaseTestCase):
    """ProjectTemplatesController integration test stubs"""

    def test_get_project_template(self):
        """Test case for get_project_template

        Get a project template
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_templates/{project_template_gid}'.format(project_template_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_templates(self):
        """Test case for get_project_templates

        Get multiple project templates
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('workspace', '12345'),
                        ('team', '14916'),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_templates',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_templates_for_team(self):
        """Test case for get_project_templates_for_team

        Get a team's project templates
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/teams/{team_gid}/project_templates'.format(team_gid='159874'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_instantiate_project(self):
        """Test case for instantiate_project

        Instantiate a project from a project template
        """
        instantiate_project_request = openapi_server.InstantiateProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_templates/{project_template_gid}/instantiateProject'.format(project_template_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(instantiate_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

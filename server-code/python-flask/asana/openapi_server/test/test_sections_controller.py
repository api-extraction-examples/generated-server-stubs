import unittest

from flask import json

from openapi_server.models.add_task_for_section_request import AddTaskForSectionRequest  # noqa: E501
from openapi_server.models.create_section_for_project201_response import CreateSectionForProject201Response  # noqa: E501
from openapi_server.models.create_section_for_project_request import CreateSectionForProjectRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_sections_for_project200_response import GetSectionsForProject200Response  # noqa: E501
from openapi_server.models.insert_section_for_project_request import InsertSectionForProjectRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSectionsController(BaseTestCase):
    """SectionsController integration test stubs"""

    def test_add_task_for_section(self):
        """Test case for add_task_for_section

        Add task to section
        """
        add_task_for_section_request = openapi_server.AddTaskForSectionRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/sections/{section_gid}/addTask'.format(section_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(add_task_for_section_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_section_for_project(self):
        """Test case for create_section_for_project

        Create a section in a project
        """
        create_section_for_project_request = openapi_server.CreateSectionForProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/sections'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(create_section_for_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_section(self):
        """Test case for delete_section

        Delete a section
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/sections/{section_gid}'.format(section_gid='321654'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_section(self):
        """Test case for get_section

        Get a section
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/sections/{section_gid}'.format(section_gid='321654'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sections_for_project(self):
        """Test case for get_sections_for_project

        Get sections in a project
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
            '/api/1.0/projects/{project_gid}/sections'.format(project_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_insert_section_for_project(self):
        """Test case for insert_section_for_project

        Move or Insert sections
        """
        insert_section_for_project_request = openapi_server.InsertSectionForProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/sections/insert'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(insert_section_for_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_section(self):
        """Test case for update_section

        Update a section
        """
        create_section_for_project_request = openapi_server.CreateSectionForProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/sections/{section_gid}'.format(section_gid='321654'),
            method='PUT',
            headers=headers,
            data=json.dumps(create_section_for_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

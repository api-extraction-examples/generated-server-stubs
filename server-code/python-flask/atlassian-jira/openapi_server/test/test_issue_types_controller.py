import unittest

from flask import json

from openapi_server.models.avatar import Avatar  # noqa: E501
from openapi_server.models.issue_type_create_bean import IssueTypeCreateBean  # noqa: E501
from openapi_server.models.issue_type_details import IssueTypeDetails  # noqa: E501
from openapi_server.models.issue_type_update_bean import IssueTypeUpdateBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueTypesController(BaseTestCase):
    """IssueTypesController integration test stubs"""

    def test_create_issue_type(self):
        """Test case for create_issue_type

        Create issue type
        """
        issue_type_create_bean = {"hierarchyLevel":0,"name":"name","description":"description","type":"subtask"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype',
            method='POST',
            headers=headers,
            data=json.dumps(issue_type_create_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("*/* not supported by Connexion. Use application/json instead. See https://github.com/zalando/connexion/pull/760")
    def test_create_issue_type_avatar(self):
        """Test case for create_issue_type_avatar

        Load issue type avatar
        """
        body = None
        query_string = [('x', 0),
                        ('y', 0),
                        ('size', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{id}/avatar2'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_issue_type(self):
        """Test case for delete_issue_type

        Delete issue type
        """
        query_string = [('alternativeIssueTypeId', 'alternative_issue_type_id_example')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_alternative_issue_types(self):
        """Test case for get_alternative_issue_types

        Get alternative issue types
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{id}/alternatives'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_all_types(self):
        """Test case for get_issue_all_types

        Get all issue types for user
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type(self):
        """Test case for get_issue_type

        Get issue type
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_types_for_project(self):
        """Test case for get_issue_types_for_project

        Get issue types for project
        """
        query_string = [('projectId', 56),
                        ('level', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/project',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_issue_type(self):
        """Test case for update_issue_type

        Update issue type
        """
        issue_type_update_bean = {"avatarId":0,"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_update_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

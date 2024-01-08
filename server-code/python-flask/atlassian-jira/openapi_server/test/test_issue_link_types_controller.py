import unittest

from flask import json

from openapi_server.models.issue_link_type import IssueLinkType  # noqa: E501
from openapi_server.models.issue_link_types import IssueLinkTypes  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueLinkTypesController(BaseTestCase):
    """IssueLinkTypesController integration test stubs"""

    def test_create_issue_link_type(self):
        """Test case for create_issue_link_type

        Create issue link type
        """
        issue_link_type = {"inward":"inward","name":"name","self":"https://openapi-generator.tech","id":"id","outward":"outward"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issueLinkType',
            method='POST',
            headers=headers,
            data=json.dumps(issue_link_type),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_issue_link_type(self):
        """Test case for delete_issue_link_type

        Delete issue link type
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issueLinkType/{issue_link_type_id}'.format(issue_link_type_id='issue_link_type_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_link_type(self):
        """Test case for get_issue_link_type

        Get issue link type
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issueLinkType/{issue_link_type_id}'.format(issue_link_type_id='issue_link_type_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_link_types(self):
        """Test case for get_issue_link_types

        Get issue link types
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issueLinkType',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_issue_link_type(self):
        """Test case for update_issue_link_type

        Update issue link type
        """
        issue_link_type = {"inward":"inward","name":"name","self":"https://openapi-generator.tech","id":"id","outward":"outward"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issueLinkType/{issue_link_type_id}'.format(issue_link_type_id='issue_link_type_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_link_type),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

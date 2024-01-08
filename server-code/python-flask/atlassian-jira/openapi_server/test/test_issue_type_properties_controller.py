import unittest

from flask import json

from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueTypePropertiesController(BaseTestCase):
    """IssueTypePropertiesController integration test stubs"""

    def test_delete_issue_type_property(self):
        """Test case for delete_issue_type_property

        Delete issue type property
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{issue_type_id}/properties/{property_key}'.format(issue_type_id='issue_type_id_example', property_key='property_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type_property(self):
        """Test case for get_issue_type_property

        Get issue type property
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{issue_type_id}/properties/{property_key}'.format(issue_type_id='issue_type_id_example', property_key='property_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type_property_keys(self):
        """Test case for get_issue_type_property_keys

        Get issue type property keys
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{issue_type_id}/properties'.format(issue_type_id='issue_type_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_issue_type_property(self):
        """Test case for set_issue_type_property

        Set issue type property
        """
        body = {"number":5,"string":"string-value"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetype/{issue_type_id}/properties/{property_key}'.format(issue_type_id='issue_type_id_example', property_key='property_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

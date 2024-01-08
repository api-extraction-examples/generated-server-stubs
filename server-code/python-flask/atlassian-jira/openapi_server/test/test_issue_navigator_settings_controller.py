import unittest

from flask import json

from openapi_server.models.column_item import ColumnItem  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueNavigatorSettingsController(BaseTestCase):
    """IssueNavigatorSettingsController integration test stubs"""

    def test_get_issue_navigator_default_columns(self):
        """Test case for get_issue_navigator_default_columns

        Get issue navigator default columns
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/settings/columns',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_set_issue_navigator_default_columns(self):
        """Test case for set_issue_navigator_default_columns

        Set issue navigator default columns
        """
        request_body = ['request_body_example']
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/settings/columns',
            method='PUT',
            headers=headers,
            data=json.dumps(request_body),
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

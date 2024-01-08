import unittest

from flask import json

from openapi_server.models.project_email_address import ProjectEmailAddress  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectEmailController(BaseTestCase):
    """ProjectEmailController integration test stubs"""

    def test_get_project_email(self):
        """Test case for get_project_email

        Get project's sender email
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id}/email'.format(project_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_project_email(self):
        """Test case for update_project_email

        Set project's sender email
        """
        project_email_address = {"emailAddress":"emailAddress","emailAddressStatus":["emailAddressStatus","emailAddressStatus"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id}/email'.format(project_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(project_email_address),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

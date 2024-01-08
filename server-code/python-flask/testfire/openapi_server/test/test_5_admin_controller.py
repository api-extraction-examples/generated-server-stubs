import unittest

from flask import json

from openapi_server.models.change_password import ChangePassword  # noqa: E501
from openapi_server.models.new_user import NewUser  # noqa: E501
from openapi_server.test import BaseTestCase


class Test5AdminController(BaseTestCase):
    """5AdminController integration test stubs"""

    def test_add_user(self):
        """Test case for add_user

        
        """
        body = openapi_server.NewUser()
        headers = { 
            'Content-Type': 'application/json',
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/admin/addUser',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_change_password(self):
        """Test case for change_password

        
        """
        body = openapi_server.ChangePassword()
        headers = { 
            'Content-Type': 'application/json',
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/admin/changePassword',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

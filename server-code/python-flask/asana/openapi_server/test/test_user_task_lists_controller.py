import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_user_task_list200_response import GetUserTaskList200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserTaskListsController(BaseTestCase):
    """UserTaskListsController integration test stubs"""

    def test_get_user_task_list(self):
        """Test case for get_user_task_list

        Get a user task list
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/user_task_lists/{user_task_list_gid}'.format(user_task_list_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_task_list_for_user(self):
        """Test case for get_user_task_list_for_user

        Get a user's task list
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('workspace', '1234')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/users/{user_gid}/user_task_list'.format(user_gid='me'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

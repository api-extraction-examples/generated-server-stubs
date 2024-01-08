import unittest

from flask import json

from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTasksController(BaseTestCase):
    """TasksController integration test stubs"""

    def test_cancel_task(self):
        """Test case for cancel_task

        Cancel task
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/task/{task_id}/cancel'.format(task_id='task_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task(self):
        """Test case for get_task

        Get task
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/task/{task_id}'.format(task_id='task_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

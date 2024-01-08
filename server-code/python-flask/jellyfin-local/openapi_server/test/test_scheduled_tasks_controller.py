import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.task_info import TaskInfo  # noqa: E501
from openapi_server.models.task_trigger_info import TaskTriggerInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestScheduledTasksController(BaseTestCase):
    """ScheduledTasksController integration test stubs"""

    def test_get_task(self):
        """Test case for get_task

        Get task by id.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/ScheduledTasks/{task_id}'.format(task_id='task_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tasks(self):
        """Test case for get_tasks

        Get tasks.
        """
        query_string = [('isHidden', True),
                        ('isEnabled', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/ScheduledTasks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_start_task(self):
        """Test case for start_task

        Start specified task.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/ScheduledTasks/Running/{task_id}'.format(task_id='task_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_stop_task(self):
        """Test case for stop_task

        Stop specified task.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/ScheduledTasks/Running/{task_id}'.format(task_id='task_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_task(self):
        """Test case for update_task

        Update specified task triggers.
        """
        task_trigger_info = {"Type":"Type","IntervalTicks":6,"TimeOfDayTicks":5,"MaxRuntimeTicks":1}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/ScheduledTasks/{task_id}/Triggers'.format(task_id='task_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(task_trigger_info),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

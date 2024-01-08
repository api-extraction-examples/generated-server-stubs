import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.extra_link_collection import ExtraLinkCollection  # noqa: E501
from openapi_server.models.get_log200_response import GetLog200Response  # noqa: E501
from openapi_server.models.list_task_instance_form import ListTaskInstanceForm  # noqa: E501
from openapi_server.models.set_task_instance_note import SetTaskInstanceNote  # noqa: E501
from openapi_server.models.task_instance import TaskInstance  # noqa: E501
from openapi_server.models.task_instance_collection import TaskInstanceCollection  # noqa: E501
from openapi_server.models.task_instance_reference import TaskInstanceReference  # noqa: E501
from openapi_server.models.update_task_instance import UpdateTaskInstance  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTaskInstanceController(BaseTestCase):
    """TaskInstanceController integration test stubs"""

    def test_get_extra_links(self):
        """Test case for get_extra_links

        List extra links
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_log(self):
        """Test case for get_log

        Get logs
        """
        query_string = [('full_content', True),
                        ('map_index', 56),
                        ('token', 'token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', task_try_number=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_mapped_task_instance(self):
        """Test case for get_mapped_task_instance

        Get a mapped task instance
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', map_index=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_mapped_task_instances(self):
        """Test case for get_mapped_task_instances

        List mapped task instances
        """
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('execution_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('execution_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('duration_gte', 3.4),
                        ('duration_lte', 3.4),
                        ('state', ['state_example']),
                        ('pool', ['pool_example']),
                        ('queue', ['queue_example']),
                        ('order_by', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/listMapped'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task_instance(self):
        """Test case for get_task_instance

        Get a task instance
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task_instances(self):
        """Test case for get_task_instances

        List task instances
        """
        query_string = [('execution_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('execution_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('duration_gte', 3.4),
                        ('duration_lte', 3.4),
                        ('state', ['state_example']),
                        ('pool', ['pool_example']),
                        ('queue', ['queue_example']),
                        ('limit', 100),
                        ('offset', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task_instances_batch(self):
        """Test case for get_task_instances_batch

        List task instances (batch)
        """
        list_task_instance_form = {"end_date_lte":"2000-01-23T04:56:07.000+00:00","start_date_gte":"2000-01-23T04:56:07.000+00:00","duration_gte":0.8008281904610115,"execution_date_gte":"2000-01-23T04:56:07.000+00:00","execution_date_lte":"2000-01-23T04:56:07.000+00:00","pool":["pool","pool"],"duration_lte":6.027456183070403,"end_date_gte":"2000-01-23T04:56:07.000+00:00","state":[null,null],"start_date_lte":"2000-01-23T04:56:07.000+00:00","dag_ids":["dag_ids","dag_ids"],"queue":["queue","queue"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/~/dagRuns/~/taskInstances/list',
            method='POST',
            headers=headers,
            data=json.dumps(list_task_instance_form),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_mapped_task_instance(self):
        """Test case for patch_mapped_task_instance

        Updates the state of a mapped task instance
        """
        update_task_instance = {"new_state":"success","dry_run":False}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', map_index=56),
            method='PATCH',
            headers=headers,
            data=json.dumps(update_task_instance),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_task_instance(self):
        """Test case for patch_task_instance

        Updates the state of a task instance
        """
        update_task_instance = {"new_state":"success","dry_run":False}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(update_task_instance),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_mapped_task_instance_note(self):
        """Test case for set_mapped_task_instance_note

        Update the TaskInstance note.
        """
        set_task_instance_note = {"note":"note"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}/setNote'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', map_index=56),
            method='PATCH',
            headers=headers,
            data=json.dumps(set_task_instance_note),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_task_instance_note(self):
        """Test case for set_task_instance_note

        Update the TaskInstance note.
        """
        set_task_instance_note = {"note":"note"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/setNote'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(set_task_instance_note),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

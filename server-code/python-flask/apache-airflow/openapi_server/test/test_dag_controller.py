import unittest

from flask import json

from openapi_server.models.clear_task_instances import ClearTaskInstances  # noqa: E501
from openapi_server.models.dag import DAG  # noqa: E501
from openapi_server.models.dag_collection import DAGCollection  # noqa: E501
from openapi_server.models.dag_detail import DAGDetail  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.get_dag_source200_response import GetDagSource200Response  # noqa: E501
from openapi_server.models.task import Task  # noqa: E501
from openapi_server.models.task_collection import TaskCollection  # noqa: E501
from openapi_server.models.task_instance_reference_collection import TaskInstanceReferenceCollection  # noqa: E501
from openapi_server.models.update_task_instances_state import UpdateTaskInstancesState  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDAGController(BaseTestCase):
    """DAGController integration test stubs"""

    def test_delete_dag(self):
        """Test case for delete_dag

        Delete a DAG
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}'.format(dag_id='dag_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag(self):
        """Test case for get_dag

        Get basic information about a DAG
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}'.format(dag_id='dag_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_details(self):
        """Test case for get_dag_details

        Get a simplified representation of DAG
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/details'.format(dag_id='dag_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_source(self):
        """Test case for get_dag_source

        Get a source code
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dagSources/{file_token}'.format(file_token='file_token_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dags(self):
        """Test case for get_dags

        List DAGs
        """
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('order_by', 'order_by_example'),
                        ('tags', ['tags_example']),
                        ('only_active', True),
                        ('dag_id_pattern', 'dag_id_pattern_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task(self):
        """Test case for get_task

        Get simplified representation of a task
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/tasks/{task_id}'.format(dag_id='dag_id_example', task_id='task_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tasks(self):
        """Test case for get_tasks

        Get tasks for DAG
        """
        query_string = [('order_by', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/tasks'.format(dag_id='dag_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_dag(self):
        """Test case for patch_dag

        Update a DAG
        """
        dag = {"description":"description","owners":["owners","owners"],"fileloc":"fileloc","has_task_concurrency_limits":True,"root_dag_id":"root_dag_id","has_import_errors":True,"last_pickled":"2000-01-23T04:56:07.000+00:00","last_parsed_time":"2000-01-23T04:56:07.000+00:00","next_dagrun_create_after":"2000-01-23T04:56:07.000+00:00","dag_id":"dag_id","scheduler_lock":True,"default_view":"default_view","next_dagrun_data_interval_end":"2000-01-23T04:56:07.000+00:00","next_dagrun_data_interval_start":"2000-01-23T04:56:07.000+00:00","is_active":True,"last_expired":"2000-01-23T04:56:07.000+00:00","max_active_runs":0,"file_token":"file_token","max_active_tasks":6,"pickle_id":"pickle_id","tags":[{"name":"name"},{"name":"name"}],"timetable_description":"timetable_description","is_paused":True,"is_subdag":True,"next_dagrun":"2000-01-23T04:56:07.000+00:00"}
        query_string = [('update_mask', ['update_mask_example'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}'.format(dag_id='dag_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(dag),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_dags(self):
        """Test case for patch_dags

        Update DAGs
        """
        dag = {"description":"description","owners":["owners","owners"],"fileloc":"fileloc","has_task_concurrency_limits":True,"root_dag_id":"root_dag_id","has_import_errors":True,"last_pickled":"2000-01-23T04:56:07.000+00:00","last_parsed_time":"2000-01-23T04:56:07.000+00:00","next_dagrun_create_after":"2000-01-23T04:56:07.000+00:00","dag_id":"dag_id","scheduler_lock":True,"default_view":"default_view","next_dagrun_data_interval_end":"2000-01-23T04:56:07.000+00:00","next_dagrun_data_interval_start":"2000-01-23T04:56:07.000+00:00","is_active":True,"last_expired":"2000-01-23T04:56:07.000+00:00","max_active_runs":0,"file_token":"file_token","max_active_tasks":6,"pickle_id":"pickle_id","tags":[{"name":"name"},{"name":"name"}],"timetable_description":"timetable_description","is_paused":True,"is_subdag":True,"next_dagrun":"2000-01-23T04:56:07.000+00:00"}
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('tags', ['tags_example']),
                        ('update_mask', ['update_mask_example']),
                        ('only_active', True),
                        ('dag_id_pattern', 'dag_id_pattern_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags',
            method='PATCH',
            headers=headers,
            data=json.dumps(dag),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_clear_task_instances(self):
        """Test case for post_clear_task_instances

        Clear a set of task instances
        """
        clear_task_instances = {"end_date":"end_date","include_future":False,"include_past":False,"reset_dag_runs":True,"include_parentdag":True,"include_subdags":True,"task_ids":["task_ids","task_ids"],"include_downstream":False,"only_running":False,"dag_run_id":"dag_run_id","include_upstream":False,"dry_run":True,"only_failed":True,"start_date":"start_date"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/clearTaskInstances'.format(dag_id='dag_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(clear_task_instances),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_set_task_instances_state(self):
        """Test case for post_set_task_instances_state

        Set a state of task instances
        """
        update_task_instances_state = {"include_future":True,"include_past":True,"execution_date":"execution_date","dag_run_id":"dag_run_id","include_upstream":True,"new_state":"success","dry_run":True,"task_id":"task_id","include_downstream":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/updateTaskInstancesState'.format(dag_id='dag_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(update_task_instances_state),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

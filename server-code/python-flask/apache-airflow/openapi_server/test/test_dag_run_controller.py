import unittest

from flask import json

from openapi_server.models.clear_dag_run import ClearDagRun  # noqa: E501
from openapi_server.models.clear_dag_run200_response import ClearDagRun200Response  # noqa: E501
from openapi_server.models.dag_run import DAGRun  # noqa: E501
from openapi_server.models.dag_run_collection import DAGRunCollection  # noqa: E501
from openapi_server.models.dataset_event_collection import DatasetEventCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.list_dag_runs_form import ListDagRunsForm  # noqa: E501
from openapi_server.models.set_dag_run_note import SetDagRunNote  # noqa: E501
from openapi_server.models.update_dag_run_state import UpdateDagRunState  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDAGRunController(BaseTestCase):
    """DAGRunController integration test stubs"""

    def test_clear_dag_run(self):
        """Test case for clear_dag_run

        Clear a DAG run
        """
        clear_dag_run = {"dry_run":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/clear'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(clear_dag_run),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dag_run(self):
        """Test case for delete_dag_run

        Delete a DAG run
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_run(self):
        """Test case for get_dag_run

        Get a DAG run
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_runs(self):
        """Test case for get_dag_runs

        List DAG runs
        """
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('execution_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('execution_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('state', ['state_example']),
                        ('order_by', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns'.format(dag_id='dag_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_runs_batch(self):
        """Test case for get_dag_runs_batch

        List DAG runs (batch)
        """
        list_dag_runs_form = {"end_date_lte":"2000-01-23T04:56:07.000+00:00","start_date_gte":"2000-01-23T04:56:07.000+00:00","execution_date_gte":"2000-01-23T04:56:07.000+00:00","page_limit":1,"execution_date_lte":"2000-01-23T04:56:07.000+00:00","order_by":"order_by","end_date_gte":"2000-01-23T04:56:07.000+00:00","page_offset":0,"start_date_lte":"2000-01-23T04:56:07.000+00:00","dag_ids":["dag_ids","dag_ids"],"states":["states","states"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/~/dagRuns/list',
            method='POST',
            headers=headers,
            data=json.dumps(list_dag_runs_form),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_upstream_dataset_events(self):
        """Test case for get_upstream_dataset_events

        Get dataset events for a DAG run
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/upstreamDatasetEvents'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_dag_run(self):
        """Test case for post_dag_run

        Trigger a new DAG run
        """
        dag_run = {"end_date":"2000-01-23T04:56:07.000+00:00","note":"note","execution_date":"2000-01-23T04:56:07.000+00:00","external_trigger":True,"conf":"{}","data_interval_start":"2000-01-23T04:56:07.000+00:00","run_type":"backfill","data_interval_end":"2000-01-23T04:56:07.000+00:00","last_scheduling_decision":"2000-01-23T04:56:07.000+00:00","dag_run_id":"dag_run_id","dag_id":"dag_id","logical_date":"2000-01-23T04:56:07.000+00:00","start_date":"2000-01-23T04:56:07.000+00:00"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns'.format(dag_id='dag_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(dag_run),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_dag_run_note(self):
        """Test case for set_dag_run_note

        Update the DagRun note.
        """
        set_dag_run_note = {"note":"note"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/setNote'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(set_dag_run_note),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_dag_run_state(self):
        """Test case for update_dag_run_state

        Modify a DAG run
        """
        update_dag_run_state = {"state":"success"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(update_dag_run_state),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

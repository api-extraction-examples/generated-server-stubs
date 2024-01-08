import unittest

from flask import json

from openapi_server.models.dataset import Dataset  # noqa: E501
from openapi_server.models.dataset_collection import DatasetCollection  # noqa: E501
from openapi_server.models.dataset_event_collection import DatasetEventCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDatasetController(BaseTestCase):
    """DatasetController integration test stubs"""

    def test_get_dataset(self):
        """Test case for get_dataset

        Get a dataset
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/datasets/{uri}'.format(uri='uri_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dataset_events(self):
        """Test case for get_dataset_events

        Get dataset events
        """
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('order_by', 'order_by_example'),
                        ('dataset_id', 56),
                        ('source_dag_id', 'source_dag_id_example'),
                        ('source_task_id', 'source_task_id_example'),
                        ('source_run_id', 'source_run_id_example'),
                        ('source_map_index', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/datasets/events',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_datasets(self):
        """Test case for get_datasets

        List datasets
        """
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('order_by', 'order_by_example'),
                        ('uri_pattern', 'uri_pattern_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/datasets',
            method='GET',
            headers=headers,
            query_string=query_string)
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


if __name__ == '__main__':
    unittest.main()

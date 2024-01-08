import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.x_com import XCom  # noqa: E501
from openapi_server.models.x_com_collection import XComCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestXComController(BaseTestCase):
    """XComController integration test stubs"""

    def test_get_xcom_entries(self):
        """Test case for get_xcom_entries

        List XCom entries
        """
        query_string = [('limit', 100),
                        ('offset', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_xcom_entry(self):
        """Test case for get_xcom_entry

        Get an XCom entry
        """
        query_string = [('deserialize', False)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{xcom_key}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', xcom_key='xcom_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

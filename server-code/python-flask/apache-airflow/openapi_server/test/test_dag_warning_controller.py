import unittest

from flask import json

from openapi_server.models.dag_warning_collection import DagWarningCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDagWarningController(BaseTestCase):
    """DagWarningController integration test stubs"""

    def test_get_dag_warnings(self):
        """Test case for get_dag_warnings

        List dag warnings
        """
        query_string = [('dag_id', 'dag_id_example'),
                        ('warning_type', 'warning_type_example'),
                        ('limit', 100),
                        ('offset', 56),
                        ('order_by', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dagWarnings',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

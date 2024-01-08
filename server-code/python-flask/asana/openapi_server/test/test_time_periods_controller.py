import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_time_period200_response import GetTimePeriod200Response  # noqa: E501
from openapi_server.models.get_time_periods200_response import GetTimePeriods200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTimePeriodsController(BaseTestCase):
    """TimePeriodsController integration test stubs"""

    def test_get_time_period(self):
        """Test case for get_time_period

        Get a time period
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/time_periods/{time_period_gid}'.format(time_period_gid='917392'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_time_periods(self):
        """Test case for get_time_periods

        Get time periods
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('start_on', '2019-09-15'),
                        ('end_on', '2019-09-15'),
                        ('workspace', '31326')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/time_periods',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

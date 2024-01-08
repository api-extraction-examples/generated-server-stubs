import unittest

from flask import json

from openapi_server.models.utc_time_response import UtcTimeResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTimeSyncController(BaseTestCase):
    """TimeSyncController integration test stubs"""

    def test_get_utc_time(self):
        """Test case for get_utc_time

        Gets the current UTC time.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/GetUtcTime',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

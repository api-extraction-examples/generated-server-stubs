import unittest

from flask import json

from openapi_server.models.evaluation_usage_error import EvaluationUsageError  # noqa: E501
from openapi_server.models.events import Events  # noqa: E501
from openapi_server.models.mau import MAU  # noqa: E501
from openapi_server.models.ma_uby_category import MAUbyCategory  # noqa: E501
from openapi_server.models.stream import Stream  # noqa: E501
from openapi_server.models.stream_by_sdk import StreamBySDK  # noqa: E501
from openapi_server.models.stream_sdk_version import StreamSDKVersion  # noqa: E501
from openapi_server.models.stream_usage_error import StreamUsageError  # noqa: E501
from openapi_server.models.streams import Streams  # noqa: E501
from openapi_server.models.usage import Usage  # noqa: E501
from openapi_server.models.usage_error import UsageError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCustomerMetricsController(BaseTestCase):
    """CustomerMetricsController integration test stubs"""

    def test_get_evaluations(self):
        """Test case for get_evaluations

        Get events usage by event id and the feature flag key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/evaluations/{env_id}/{flag_key}'.format(env_id='env_id_example', flag_key='flag_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_event(self):
        """Test case for get_event

        Get events usage by event type.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/events/{type}'.format(type='type_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_events(self):
        """Test case for get_events

        Get events usage endpoints.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/events',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_mau(self):
        """Test case for get_mau

        Get monthly active user data.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/mau',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_mauby_category(self):
        """Test case for get_mauby_category

        Get monthly active user data by category.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/mau/bycategory',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_stream(self):
        """Test case for get_stream

        Get a stream endpoint and return timeseries data.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/streams/{source}'.format(source='source_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_stream_by_sdk(self):
        """Test case for get_stream_by_sdk

        Get a stream timeseries data by source show sdk version metadata.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/streams/{source}/bysdkversion'.format(source='source_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_stream_sdk_version(self):
        """Test case for get_stream_sdk_version

        Get a stream timeseries data by source and show all sdk version associated.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/streams/{source}/sdkversions'.format(source='source_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_streams(self):
        """Test case for get_streams

        Returns a list of all streams.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage/streams',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_usage(self):
        """Test case for get_usage

        Returns of the usage endpoints available.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/usage',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDlnaServerController(BaseTestCase):
    """DlnaServerController integration test stubs"""

    def test_get_connection_manager(self):
        """Test case for get_connection_manager

        Gets Dlna media receiver registrar xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/ConnectionManager'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_connection_manager2(self):
        """Test case for get_connection_manager2

        Gets Dlna media receiver registrar xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/ConnectionManager/ConnectionManager'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_connection_manager3(self):
        """Test case for get_connection_manager3

        Gets Dlna media receiver registrar xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/ConnectionManager/ConnectionManager.xml'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_content_directory(self):
        """Test case for get_content_directory

        Gets Dlna content directory xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/ContentDirectory'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_content_directory2(self):
        """Test case for get_content_directory2

        Gets Dlna content directory xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/ContentDirectory/ContentDirectory'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_content_directory3(self):
        """Test case for get_content_directory3

        Gets Dlna content directory xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/ContentDirectory/ContentDirectory.xml'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_description_xml(self):
        """Test case for get_description_xml

        Get Description Xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/description'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_description_xml2(self):
        """Test case for get_description_xml2

        Get Description Xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/description.xml'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_icon(self):
        """Test case for get_icon

        Gets a server icon.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Dlna/icons/{file_name}'.format(file_name='file_name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_icon_id(self):
        """Test case for get_icon_id

        Gets a server icon.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Dlna/{server_id}/icons/{file_name}'.format(server_id='server_id_example', file_name='file_name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_media_receiver_registrar(self):
        """Test case for get_media_receiver_registrar

        Gets Dlna media receiver registrar xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/MediaReceiverRegistrar'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_media_receiver_registrar2(self):
        """Test case for get_media_receiver_registrar2

        Gets Dlna media receiver registrar xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/MediaReceiverRegistrar/MediaReceiverRegistrar'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_media_receiver_registrar3(self):
        """Test case for get_media_receiver_registrar3

        Gets Dlna media receiver registrar xml.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/MediaReceiverRegistrar/MediaReceiverRegistrar.xml'.format(server_id='server_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_process_connection_manager_control_request(self):
        """Test case for process_connection_manager_control_request

        Process a connection manager control request.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/ConnectionManager/Control'.format(server_id='server_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_process_content_directory_control_request(self):
        """Test case for process_content_directory_control_request

        Process a content directory control request.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/ContentDirectory/Control'.format(server_id='server_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_process_media_receiver_registrar_control_request(self):
        """Test case for process_media_receiver_registrar_control_request

        Process a media receiver registrar control request.
        """
        headers = { 
            'Accept': 'text/xml',
        }
        response = self.client.open(
            '/Dlna/{server_id}/MediaReceiverRegistrar/Control'.format(server_id='server_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

import unittest

from flask import json

from openapi_server.models.attachment import Attachment  # noqa: E501
from openapi_server.models.attachment_archive_impl import AttachmentArchiveImpl  # noqa: E501
from openapi_server.models.attachment_archive_metadata_readable import AttachmentArchiveMetadataReadable  # noqa: E501
from openapi_server.models.attachment_metadata import AttachmentMetadata  # noqa: E501
from openapi_server.models.attachment_settings import AttachmentSettings  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueAttachmentsController(BaseTestCase):
    """IssueAttachmentsController integration test stubs"""

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_add_attachment(self):
        """Test case for add_attachment

        Add attachment
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/attachments'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_expand_attachment_for_humans(self):
        """Test case for expand_attachment_for_humans

        Get all metadata for an expanded attachment
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/attachment/{id}/expand/human'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_expand_attachment_for_machines(self):
        """Test case for expand_attachment_for_machines

        Get contents metadata for an expanded attachment
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/attachment/{id}/expand/raw'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attachment(self):
        """Test case for get_attachment

        Get attachment metadata
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/attachment/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attachment_content(self):
        """Test case for get_attachment_content

        Get attachment content
        """
        query_string = [('redirect', True)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/attachment/content/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attachment_meta(self):
        """Test case for get_attachment_meta

        Get Jira attachment settings
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/attachment/meta',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_attachment_thumbnail(self):
        """Test case for get_attachment_thumbnail

        Get attachment thumbnail
        """
        query_string = [('redirect', True),
                        ('fallbackToDefault', True),
                        ('width', 56),
                        ('height', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/attachment/thumbnail/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_attachment(self):
        """Test case for remove_attachment

        Delete attachment
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/attachment/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

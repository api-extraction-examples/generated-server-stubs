import unittest

from flask import json

from openapi_server.models.age_rating_declaration_response import AgeRatingDeclarationResponse  # noqa: E501
from openapi_server.models.app_store_review_detail_response import AppStoreReviewDetailResponse  # noqa: E501
from openapi_server.models.app_store_version_build_linkage_request import AppStoreVersionBuildLinkageRequest  # noqa: E501
from openapi_server.models.app_store_version_build_linkage_response import AppStoreVersionBuildLinkageResponse  # noqa: E501
from openapi_server.models.app_store_version_create_request import AppStoreVersionCreateRequest  # noqa: E501
from openapi_server.models.app_store_version_localizations_response import AppStoreVersionLocalizationsResponse  # noqa: E501
from openapi_server.models.app_store_version_phased_release_response import AppStoreVersionPhasedReleaseResponse  # noqa: E501
from openapi_server.models.app_store_version_response import AppStoreVersionResponse  # noqa: E501
from openapi_server.models.app_store_version_submission_response import AppStoreVersionSubmissionResponse  # noqa: E501
from openapi_server.models.app_store_version_update_request import AppStoreVersionUpdateRequest  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.idfa_declaration_response import IdfaDeclarationResponse  # noqa: E501
from openapi_server.models.routing_app_coverage_response import RoutingAppCoverageResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppStoreVersionsController(BaseTestCase):
    """AppStoreVersionsController integration test stubs"""

    def test_app_store_versions_age_rating_declaration_get_to_one_related(self):
        """Test case for app_store_versions_age_rating_declaration_get_to_one_related

        
        """
        query_string = [('fields[ageRatingDeclarations]', ['fields_age_rating_declarations_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/ageRatingDeclaration'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_app_store_review_detail_get_to_one_related(self):
        """Test case for app_store_versions_app_store_review_detail_get_to_one_related

        
        """
        query_string = [('fields[appStoreReviewDetails]', ['fields_app_store_review_details_example']),
                        ('fields[appStoreVersions]', ['fields_app_store_versions_example']),
                        ('fields[appStoreReviewAttachments]', ['fields_app_store_review_attachments_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/appStoreReviewDetail'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_app_store_version_localizations_get_to_many_related(self):
        """Test case for app_store_versions_app_store_version_localizations_get_to_many_related

        
        """
        query_string = [('fields[appStoreVersionLocalizations]', ['fields_app_store_version_localizations_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/appStoreVersionLocalizations'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_app_store_version_phased_release_get_to_one_related(self):
        """Test case for app_store_versions_app_store_version_phased_release_get_to_one_related

        
        """
        query_string = [('fields[appStoreVersionPhasedReleases]', ['fields_app_store_version_phased_releases_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/appStoreVersionPhasedRelease'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_app_store_version_submission_get_to_one_related(self):
        """Test case for app_store_versions_app_store_version_submission_get_to_one_related

        
        """
        query_string = [('fields[appStoreVersions]', ['fields_app_store_versions_example']),
                        ('fields[appStoreVersionSubmissions]', ['fields_app_store_version_submissions_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/appStoreVersionSubmission'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_build_get_to_one_related(self):
        """Test case for app_store_versions_build_get_to_one_related

        
        """
        query_string = [('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/build'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_build_get_to_one_relationship(self):
        """Test case for app_store_versions_build_get_to_one_relationship

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/relationships/build'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_build_update_to_one_relationship(self):
        """Test case for app_store_versions_build_update_to_one_relationship

        
        """
        app_store_version_build_linkage_request = {"data":{"id":"id","type":"builds"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/relationships/build'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_store_version_build_linkage_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_create_instance(self):
        """Test case for app_store_versions_create_instance

        
        """
        app_store_version_create_request = {"data":{"relationships":{"app":{"data":{"id":"id","type":"apps"}},"build":{"data":{"id":"id","type":"builds"}}},"attributes":{"copyright":"copyright","earliestReleaseDate":"2000-01-23T04:56:07.000+00:00","usesIdfa":True,"versionString":"versionString","releaseType":"MANUAL"},"type":"appStoreVersions"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions',
            method='POST',
            headers=headers,
            data=json.dumps(app_store_version_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_delete_instance(self):
        """Test case for app_store_versions_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_get_instance(self):
        """Test case for app_store_versions_get_instance

        
        """
        query_string = [('fields[appStoreVersions]', ['fields_app_store_versions_example']),
                        ('include', ['include_example']),
                        ('fields[appStoreVersionLocalizations]', ['fields_app_store_version_localizations_example']),
                        ('fields[idfaDeclarations]', ['fields_idfa_declarations_example']),
                        ('fields[routingAppCoverages]', ['fields_routing_app_coverages_example']),
                        ('fields[appStoreVersionPhasedReleases]', ['fields_app_store_version_phased_releases_example']),
                        ('fields[ageRatingDeclarations]', ['fields_age_rating_declarations_example']),
                        ('fields[appStoreReviewDetails]', ['fields_app_store_review_details_example']),
                        ('fields[builds]', ['fields_builds_example']),
                        ('fields[appStoreVersionSubmissions]', ['fields_app_store_version_submissions_example']),
                        ('limit[appStoreVersionLocalizations]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_idfa_declaration_get_to_one_related(self):
        """Test case for app_store_versions_idfa_declaration_get_to_one_related

        
        """
        query_string = [('fields[idfaDeclarations]', ['fields_idfa_declarations_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/idfaDeclaration'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_routing_app_coverage_get_to_one_related(self):
        """Test case for app_store_versions_routing_app_coverage_get_to_one_related

        
        """
        query_string = [('fields[routingAppCoverages]', ['fields_routing_app_coverages_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}/routingAppCoverage'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_versions_update_instance(self):
        """Test case for app_store_versions_update_instance

        
        """
        app_store_version_update_request = {"data":{"relationships":{"build":{"data":{"id":"id","type":"builds"}}},"attributes":{"copyright":"copyright","downloadable":True,"earliestReleaseDate":"2000-01-23T04:56:07.000+00:00","usesIdfa":True,"versionString":"versionString","releaseType":"MANUAL"},"id":"id","type":"appStoreVersions"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersions/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_store_version_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ApiV1AppsPostRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, client_name=None, redirect_uris=None, scopes=None, website=None):  # noqa: E501
        """ApiV1AppsPostRequest - a model defined in OpenAPI

        :param client_name: The client_name of this ApiV1AppsPostRequest.  # noqa: E501
        :type client_name: str
        :param redirect_uris: The redirect_uris of this ApiV1AppsPostRequest.  # noqa: E501
        :type redirect_uris: str
        :param scopes: The scopes of this ApiV1AppsPostRequest.  # noqa: E501
        :type scopes: str
        :param website: The website of this ApiV1AppsPostRequest.  # noqa: E501
        :type website: str
        """
        self.openapi_types = {
            'client_name': str,
            'redirect_uris': str,
            'scopes': str,
            'website': str
        }

        self.attribute_map = {
            'client_name': 'client_name',
            'redirect_uris': 'redirect_uris',
            'scopes': 'scopes',
            'website': 'website'
        }

        self._client_name = client_name
        self._redirect_uris = redirect_uris
        self._scopes = scopes
        self._website = website

    @classmethod
    def from_dict(cls, dikt) -> 'ApiV1AppsPostRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _api_v1_apps_post_request of this ApiV1AppsPostRequest.  # noqa: E501
        :rtype: ApiV1AppsPostRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def client_name(self) -> str:
        """Gets the client_name of this ApiV1AppsPostRequest.

        A name for your application  # noqa: E501

        :return: The client_name of this ApiV1AppsPostRequest.
        :rtype: str
        """
        return self._client_name

    @client_name.setter
    def client_name(self, client_name: str):
        """Sets the client_name of this ApiV1AppsPostRequest.

        A name for your application  # noqa: E501

        :param client_name: The client_name of this ApiV1AppsPostRequest.
        :type client_name: str
        """
        if client_name is None:
            raise ValueError("Invalid value for `client_name`, must not be `None`")  # noqa: E501

        self._client_name = client_name

    @property
    def redirect_uris(self) -> str:
        """Gets the redirect_uris of this ApiV1AppsPostRequest.

        Where the user should be redirected after authorization. To display the authorization code to the user instead of redirecting to a web page, use urn:ietf:wg:oauth:2.0:oob in this parameter.  # noqa: E501

        :return: The redirect_uris of this ApiV1AppsPostRequest.
        :rtype: str
        """
        return self._redirect_uris

    @redirect_uris.setter
    def redirect_uris(self, redirect_uris: str):
        """Sets the redirect_uris of this ApiV1AppsPostRequest.

        Where the user should be redirected after authorization. To display the authorization code to the user instead of redirecting to a web page, use urn:ietf:wg:oauth:2.0:oob in this parameter.  # noqa: E501

        :param redirect_uris: The redirect_uris of this ApiV1AppsPostRequest.
        :type redirect_uris: str
        """
        if redirect_uris is None:
            raise ValueError("Invalid value for `redirect_uris`, must not be `None`")  # noqa: E501

        self._redirect_uris = redirect_uris

    @property
    def scopes(self) -> str:
        """Gets the scopes of this ApiV1AppsPostRequest.

        Space separated list of scopes. If none is provided, defaults to read.  # noqa: E501

        :return: The scopes of this ApiV1AppsPostRequest.
        :rtype: str
        """
        return self._scopes

    @scopes.setter
    def scopes(self, scopes: str):
        """Sets the scopes of this ApiV1AppsPostRequest.

        Space separated list of scopes. If none is provided, defaults to read.  # noqa: E501

        :param scopes: The scopes of this ApiV1AppsPostRequest.
        :type scopes: str
        """

        self._scopes = scopes

    @property
    def website(self) -> str:
        """Gets the website of this ApiV1AppsPostRequest.

        A URL to the homepage of your app  # noqa: E501

        :return: The website of this ApiV1AppsPostRequest.
        :rtype: str
        """
        return self._website

    @website.setter
    def website(self, website: str):
        """Sets the website of this ApiV1AppsPostRequest.

        A URL to the homepage of your app  # noqa: E501

        :param website: The website of this ApiV1AppsPostRequest.
        :type website: str
        """

        self._website = website
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PluginRunData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, package=None, reporting_event=None, state=None, summary=None, text=None, title=None, version=None):  # noqa: E501
        """PluginRunData - a model defined in OpenAPI

        :param package: The package of this PluginRunData.  # noqa: E501
        :type package: str
        :param reporting_event: The reporting_event of this PluginRunData.  # noqa: E501
        :type reporting_event: str
        :param state: The state of this PluginRunData.  # noqa: E501
        :type state: str
        :param summary: The summary of this PluginRunData.  # noqa: E501
        :type summary: str
        :param text: The text of this PluginRunData.  # noqa: E501
        :type text: str
        :param title: The title of this PluginRunData.  # noqa: E501
        :type title: str
        :param version: The version of this PluginRunData.  # noqa: E501
        :type version: str
        """
        self.openapi_types = {
            'package': str,
            'reporting_event': str,
            'state': str,
            'summary': str,
            'text': str,
            'title': str,
            'version': str
        }

        self.attribute_map = {
            'package': 'package',
            'reporting_event': 'reporting_event',
            'state': 'state',
            'summary': 'summary',
            'text': 'text',
            'title': 'title',
            'version': 'version'
        }

        self._package = package
        self._reporting_event = reporting_event
        self._state = state
        self._summary = summary
        self._text = text
        self._title = title
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'PluginRunData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The pluginRunData of this PluginRunData.  # noqa: E501
        :rtype: PluginRunData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def package(self) -> str:
        """Gets the package of this PluginRunData.


        :return: The package of this PluginRunData.
        :rtype: str
        """
        return self._package

    @package.setter
    def package(self, package: str):
        """Sets the package of this PluginRunData.


        :param package: The package of this PluginRunData.
        :type package: str
        """

        self._package = package

    @property
    def reporting_event(self) -> str:
        """Gets the reporting_event of this PluginRunData.


        :return: The reporting_event of this PluginRunData.
        :rtype: str
        """
        return self._reporting_event

    @reporting_event.setter
    def reporting_event(self, reporting_event: str):
        """Sets the reporting_event of this PluginRunData.


        :param reporting_event: The reporting_event of this PluginRunData.
        :type reporting_event: str
        """

        self._reporting_event = reporting_event

    @property
    def state(self) -> str:
        """Gets the state of this PluginRunData.


        :return: The state of this PluginRunData.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state: str):
        """Sets the state of this PluginRunData.


        :param state: The state of this PluginRunData.
        :type state: str
        """

        self._state = state

    @property
    def summary(self) -> str:
        """Gets the summary of this PluginRunData.


        :return: The summary of this PluginRunData.
        :rtype: str
        """
        return self._summary

    @summary.setter
    def summary(self, summary: str):
        """Sets the summary of this PluginRunData.


        :param summary: The summary of this PluginRunData.
        :type summary: str
        """

        self._summary = summary

    @property
    def text(self) -> str:
        """Gets the text of this PluginRunData.


        :return: The text of this PluginRunData.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this PluginRunData.


        :param text: The text of this PluginRunData.
        :type text: str
        """

        self._text = text

    @property
    def title(self) -> str:
        """Gets the title of this PluginRunData.


        :return: The title of this PluginRunData.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this PluginRunData.


        :param title: The title of this PluginRunData.
        :type title: str
        """

        self._title = title

    @property
    def version(self) -> str:
        """Gets the version of this PluginRunData.


        :return: The version of this PluginRunData.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version: str):
        """Sets the version of this PluginRunData.


        :param version: The version of this PluginRunData.
        :type version: str
        """

        self._version = version

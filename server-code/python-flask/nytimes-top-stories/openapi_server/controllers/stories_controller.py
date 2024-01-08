import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.section_format_get200_response import SectionFormatGet200Response  # noqa: E501
from openapi_server import util


def section_format_get(section, format, param_callback=None):  # noqa: E501
    """Top Stories

    The Top Stories API returns a list of articles and associated images currently on the specified section.  Support JSON and JSONP.  # noqa: E501

    :param section: The section the story appears in.
    :type section: str
    :param format: if this is JSONP or JSON
    :type format: str
    :param param_callback: The name of the function the API call results will be passed to. Required when using JSONP. This parameter has only one valid value per section. The format is {section_name}TopStoriesCallback. 
    :type param_callback: str

    :rtype: Union[SectionFormatGet200Response, Tuple[SectionFormatGet200Response, int], Tuple[SectionFormatGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'

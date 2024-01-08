import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.publication_id_for_publication_slug_get200_response import PublicationIdForPublicationSlugGet200Response  # noqa: E501
from openapi_server.models.publication_publication_id_articles_get200_response import PublicationPublicationIdArticlesGet200Response  # noqa: E501
from openapi_server.models.publication_publication_id_get200_response import PublicationPublicationIdGet200Response  # noqa: E501
from openapi_server.models.publication_publication_id_newsletter_get200_response import PublicationPublicationIdNewsletterGet200Response  # noqa: E501
from openapi_server import util


def publication_id_for_publication_slug_get(publication_slug):  # noqa: E501
    """Get Publication ID

    Returns the unique &#x60;publication_id&#x60; for the given &#x60;publication_slug&#x60;.  **Note:** You can find the &#x60;publication_slug&#x60; from the publication&#39;s homepage URL. - medium.com/**publication_slug**  # noqa: E501

    :param publication_slug: It&#39;s a lowercased hyphen-separated unique string alloted to each Medium Publication.
    :type publication_slug: str

    :rtype: Union[PublicationIdForPublicationSlugGet200Response, Tuple[PublicationIdForPublicationSlugGet200Response, int], Tuple[PublicationIdForPublicationSlugGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def publication_publication_id_articles_get(publication_id, _from=None):  # noqa: E501
    """Get Publication Articles

    Returns the list of &#x60;articles_ids&#x60;, of the latest 25 articles, posted in that publication.  # noqa: E501

    :param publication_id: It&#39;s a unique hash id assigned to every Medium Publication.
    :type publication_id: str
    :param _from: To get the articles before specified date and time.
    :type _from: str

    :rtype: Union[PublicationPublicationIdArticlesGet200Response, Tuple[PublicationPublicationIdArticlesGet200Response, int], Tuple[PublicationPublicationIdArticlesGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def publication_publication_id_get(publication_id):  # noqa: E501
    """Get Publication Info

    Returns the publication related information such as *Publication name, Tagline, Description, Tags, Followers Count, Twitter username, Instagram username, Facebook Page name, etc …*  **Note:** If you don&#39;t know the &#x60;publication_id&#x60;, you can get it from any article published by it. Use endpoint \&quot;/article/{article_id}\&quot; to retrieve the &#x60;publication_id&#x60;.  # noqa: E501

    :param publication_id: It&#39;s a unique hash id assigned to every Medium Publication.
    :type publication_id: str

    :rtype: Union[PublicationPublicationIdGet200Response, Tuple[PublicationPublicationIdGet200Response, int], Tuple[PublicationPublicationIdGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def publication_publication_id_newsletter_get(publication_id):  # noqa: E501
    """Get Publication Newsletter

    Returns the newsletter related information such as *id, name, description, slug, creator_id, subscribers, image_url, etc …*  **Note:** If you don&#39;t know the &#x60;publication_id&#x60;, you can get it from any article published by it. Use endpoint \&quot;/article/{article_id}\&quot; to retrieve the &#x60;publication_id&#x60;.  # noqa: E501

    :param publication_id: It&#39;s a unique hash id assigned to every Medium Publication.
    :type publication_id: str

    :rtype: Union[PublicationPublicationIdNewsletterGet200Response, Tuple[PublicationPublicationIdNewsletterGet200Response, int], Tuple[PublicationPublicationIdNewsletterGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
